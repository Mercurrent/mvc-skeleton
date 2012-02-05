package ru.hh.school.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommendationService {

    //private final RecommendationRepository privateRecommendations;
    //private final RecommendationRepository publicRecommendations;
    private final RecommendationRepository recommendations;

    @Autowired
    public RecommendationService(RecommendationRepository recommendations) {
        this.recommendations = recommendations;
    }

    public Recommendation registerRecommendation(final Long refereeId,
                                                 final Long recommendedUserId,
                                                 final Long addresseeId,
                                                 final String text) {

        Recommendation recommendation = new Recommendation(refereeId, recommendedUserId, addresseeId);
        recommendations.put(recommendation);
        return recommendation;
    }
    
    

}
