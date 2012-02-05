package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

public class Recommendation extends Entity {

    private final Long refereeId;
    private final Long recommendedUserId;
    private final Long addresseeId;
    private String text;

    public Recommendation(final Long refereeId, final Long recommendedUserId, final Long addresseeId) {
        this.refereeId = refereeId;
        this.recommendedUserId = recommendedUserId;
        this.addresseeId = addresseeId;
    }

    public void setText(final String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public Long getRefereeId() {
        return refereeId;
    }
    
    public Long getRecommendedUserId() {
        return recommendedUserId;
    }
    
    public Long getAddresseeId() {
        return addresseeId;
    }




}
