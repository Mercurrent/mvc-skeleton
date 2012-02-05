package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

import java.util.ArrayList;
import java.util.List;

public class RecommendationUserAssociation extends Entity {
    
    private final Long userId;
    private List<Long> beingRecommendedRecommendationsIds;
    private List<Long> beingRefereeRecommendationsIds;
    private List<Long> beingAddresseeRecommendationsIds;
    
    public RecommendationUserAssociation(final Long userId) {
        this.userId = userId;
        beingAddresseeRecommendationsIds = new ArrayList<Long>();
        beingRecommendedRecommendationsIds = new ArrayList<Long>();
        beingRefereeRecommendationsIds = new ArrayList<Long>();
    }
    
    public Iterable<Long> getRecommendationIdsWhereReferee() {
        return beingRefereeRecommendationsIds;
    }
    
    public Iterable<Long> getRecommendationIdsWhereRecommended() {
        return beingRecommendedRecommendationsIds;
    }

    public Iterable<Long> getRecommendationIdsWhereAddressee() {
        return beingAddresseeRecommendationsIds;
    }

    public void setRecommendationWhereReferee(final Long recommendationId) {

    }
}
