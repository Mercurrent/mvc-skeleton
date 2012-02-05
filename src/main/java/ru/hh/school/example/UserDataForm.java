package ru.hh.school.example;

import java.util.ArrayList;
import java.util.List;

public class UserDataForm {

    private String education;
    private String experience;
    private String contacts;
    private String additionalInfo;
    private List<Recommendation> publicRecommendations;

    public UserDataForm(final String education, 
                        final String experience,
                        final String contacts,
                        final String additionalInfo) {

        this.education = education;
        this.additionalInfo = additionalInfo;
        this.experience = experience;
        this.contacts = contacts;
        publicRecommendations = new ArrayList<Recommendation>();
    }

    public String getEducation() {
        return education;
    }

    public String getExperience() {
        return experience;
    }

    public String getContacts() {
        return contacts;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    public String set


}
