package ru.hh.school.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.school.example.exceptions.EmailAlreadyBoundException;
import ru.hh.school.example.exceptions.NoSuchEmailException;
import ru.hh.school.example.exceptions.NoSuchUserIdException;
import ru.hh.school.example.exceptions.WrongPasswordException;

@Component
public class UserService {

    private final UserRepository users;

    @Autowired
    public UserService(UserRepository users) {
        this.users = users;
    }

    public User registerUser(String email, String password, String fullName) throws EmailAlreadyBoundException {
        User existing = users.byEmail(email);
        if (existing != null)
            throw new EmailAlreadyBoundException(email);
        User user = new User(email, password, fullName);
        users.put(user);
        return user;
    }
    
    public User getUserById(Long id) throws NoSuchUserIdException{
        User userWithSuchId = users.byId(id);
        if (userWithSuchId == null) {
            throw new NoSuchUserIdException(id);
        }
        return users.byId(id);
    }
    
    public Long getIdByMailAndPassword(String email, String password)
            throws NoSuchEmailException, WrongPasswordException {

        User userWithSuchMail = users.byEmail(email);

        if (userWithSuchMail == null)
            throw new NoSuchEmailException(email);
        if (!userWithSuchMail.getPassword().equals(password)) {
            throw new WrongPasswordException(email, password);
        }

        return userWithSuchMail.getId();
    }
}
