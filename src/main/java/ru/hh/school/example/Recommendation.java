package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

public class Recommendation extends Entity {

    private final User referee;
    private final User owner;
    private String text;

    public Recommendation(final User referee, final User owner) {
        this.referee = referee;
        this.owner = owner;
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
