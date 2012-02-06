package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

import java.util.ArrayList;
import java.util.List;

public class User extends Entity {

    private String email;
    private String password;
    private String fullName;
    private UserDataForm info;
    private List<Long> writtenRecommendationsIds;
    private List<Long> recommendationsOnOthersIds;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        info = new UserDataForm();
        writtenRecommendationsIds = new ArrayList<Long>();
        recommendationsOnOthersIds = new ArrayList<Long>();
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
    
    public void setInfo(final UserDataForm info) {
        this.info = info;
    }
}
