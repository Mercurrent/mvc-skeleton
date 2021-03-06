package ru.hh.school.example;

public class RequestForRecommendation {
    
    private final Long refereeId;
    private final Long requesterId;
    private final Long recommendedUserId;
    private String text;
    
    public RequestForRecommendation(final Long refereeId,
                                    final Long requesterId,
                                    final Long recommendedUserId,
                                    final String text) {
        this.recommendedUserId = recommendedUserId;
        this.refereeId = refereeId;
        this.requesterId = requesterId;
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

            
}
