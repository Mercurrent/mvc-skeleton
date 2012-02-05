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

    public Recommendation registerRecommendation(final User referee,
                                                 final User recommendedUser,
                                                 final User addressee,
                                                 final String text) {


        User existing = users.byEmail(email);
        if (existing != null)
            throw new EmailAlreadyBoundException(email);
        User user = new User(email, password, fullName);
        users.put(user);
        return user;
    }
    
    

}
