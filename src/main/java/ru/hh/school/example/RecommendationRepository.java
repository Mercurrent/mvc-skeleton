package ru.hh.school.example;

import ru.hh.school.example.ddd.Repository;

public interface RecommendationRepository extends Repository<Recommendation> {
    Recommendation byRecommendedUser(Long recommendedUserId);
    
    Recommendation byReferee(Long refereeId);
    
    Recommendation byAddressee(Long addresseeId);

}
