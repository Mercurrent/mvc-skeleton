package ru.hh.school.example;

import java.util.List;

public class RecommendationAssociatedUser {
    
    private final Long userId;
    private List<Long> beingRecommendedRecommendationsIds;
    private List<Long> beingRefereeRecommendationsIds;
    private List<Long> beingAddresseeRecommendationsIds;
    
    public RecommendationAssociatedUser(final Long userId) {
        this.userId = userId;
    }
}
