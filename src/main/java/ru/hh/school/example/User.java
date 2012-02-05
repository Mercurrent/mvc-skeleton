package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

import java.util.ArrayList;
import java.util.List;

public class User extends Entity {

    private String email;
    private String password;
    private String fullName;
    private String education;
    private String experience;
    private String contacts;
    private String additionalInfo;
    private List<Recommendation> recommendations;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        recommendations = new ArrayList<Recommendation>();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }
    
    public String getEducation() {
        return education;
    }
    
    public String getExperience() {
        return experience;                
    }
    
    public String getContacts() {
        return contacts;
    }
    
    public String getAdditionalInfo() {
        return additionalInfo;
    }
            
}
