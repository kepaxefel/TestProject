package com.myproject.barannyk.entity;

import lombok.Builder;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
@Builder
public class Worker extends Person {

    private String position;
    private String experience;
    private String education;
    private String englishLevel;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }
}
