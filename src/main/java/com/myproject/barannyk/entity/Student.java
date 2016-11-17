package com.myproject.barannyk.entity;

import lombok.Builder;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
@Builder
public class Student extends Person {

    private String nameOfUniversity;
    private String currentYear;
    private String yearOfGraduation;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear;
    }

    public String getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
