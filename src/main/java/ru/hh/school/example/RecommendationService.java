package ru.hh.school.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecommendationService {

    private final RecommendationRepository recommendations;
    private final RecommendationUserAssociationRepository recommendationUserAssociations;

    @Autowired
    public RecommendationService(RecommendationRepository recommendations,
                                 RecommendationUserAssociationRepository associations) {
        this.recommendations = recommendations;
        recommendationUserAssociations = associations;
    }

    public Recommendation registerRecommendation(final Long refereeId,
                                                 final Long recommendedUserId,
                                                 final String text) {

        Recommendation recommendation = new Recommendation(refereeId, recommendedUserId);
        recommendations.put(recommendation);

        recommendationUserAssociations.


        return recommendation;
    }
    
    public Recommendation recommendationById(Long recommendationId) {
        return recommendations.byId(recommendationId);
    }

    public Iterable<Recommendation> allByReferee(Long refereeId) {
        List<Recommendation> recommendations = new ArrayList<Recommendation>();


    }

    

}
