package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

public class Recommendation extends Entity {

    private final User referee;
    private final User recommendedUser;
    private final User addressee;
    private String text;

    public Recommendation(final User referee, final User recommendedUser, final User addressee) {
        this.referee = referee;
        this.recommendedUser = recommendedUser;
        this.addressee = addressee;
    }

    public void setText(final String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public User getReferee() {
        return referee;
    }
    
    public User getOwner() {
        return owner;
    }




}
