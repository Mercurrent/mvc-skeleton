package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

public class Recommendation extends Entity {

    private final Long refereeId;
    private final Long recommendedUserId;
    private String text;

    public Recommendation(final Long refereeId, final Long recommendedUserId) {
        this.refereeId = refereeId;
        this.recommendedUserId = recommendedUserId;
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

}
