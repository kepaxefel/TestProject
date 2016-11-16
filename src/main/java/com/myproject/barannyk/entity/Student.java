package com.myproject.barannyk.entity;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class Student extends Person {

    private String nameOfUniversity;
    private int currentYear;
    private int yearOfGraduation;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
