package ru.hh.school.example;

import java.util.ArrayList;
import java.util.List;

public class UserDataForm {

    private String education;
    private String experience;
    private String contacts;
    private String additionalInfo;
    private final List<Recommendation> publicRecommendations;

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
    
    public void setEducation(final String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(final String experience) {
        this.experience = experience;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(final String contacts) {
        this.contacts = contacts;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(final String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


}
