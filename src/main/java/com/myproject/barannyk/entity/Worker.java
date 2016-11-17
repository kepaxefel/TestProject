package com.myproject.barannyk.entity;

import lombok.Builder;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class Worker extends Person {

    private String position;
    private String experience;
    private String education;
    private String englishLevel;

    @Builder
    public Worker(String name, String lastName, String position, String experience, String education, String englishLevel) {
        super(name, lastName);
        this.position = position;
        this.experience = experience;
        this.education = education;
        this.englishLevel = englishLevel;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (position != null ? !position.equals(worker.position) : worker.position != null) return false;
        if (experience != null ? !experience.equals(worker.experience) : worker.experience != null) return false;
        if (education != null ? !education.equals(worker.education) : worker.education != null) return false;
        return englishLevel != null ? englishLevel.equals(worker.englishLevel) : worker.englishLevel == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (englishLevel != null ? englishLevel.hashCode() : 0);
        return result;
    }
}
