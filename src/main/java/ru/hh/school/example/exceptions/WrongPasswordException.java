package ru.hh.school.example.exceptions;

public class WrongPasswordException extends Exception{
    
    private final String email;
    private final String password;
    
    public WrongPasswordException(final String email, final String password) {
        super(password);
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
}
