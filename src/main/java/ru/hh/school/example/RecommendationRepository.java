package ru.hh.school.example;

import ru.hh.school.example.ddd.Repository;

public interface RecommendationRepository extends Repository<Recommendation> {
    Recommendation byOwner(String owner);
    
    Recommendation byReferee(String referee);
    
    Recommendation byRecipient(String recipient);

}
