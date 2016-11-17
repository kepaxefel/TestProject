package com.myproject.barannyk.entity;

import lombok.Builder;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class Student extends Person {

    private String nameOfUniversity;
    private String currentYear;
    private String yearOfGraduation;

    @Builder
    public Student(String name, String lastName, String nameOfUniversity, String currentYear, String yearOfGraduation ) {
        super(name, lastName);
        this.nameOfUniversity = nameOfUniversity;
        this.currentYear = currentYear;
        this.yearOfGraduation = yearOfGraduation;
    }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (nameOfUniversity != null ? !nameOfUniversity.equals(student.nameOfUniversity) : student.nameOfUniversity != null)
            return false;
        if (currentYear != null ? !currentYear.equals(student.currentYear) : student.currentYear != null) return false;
        return yearOfGraduation != null ? yearOfGraduation.equals(student.yearOfGraduation) : student.yearOfGraduation == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nameOfUniversity != null ? nameOfUniversity.hashCode() : 0);
        result = 31 * result + (currentYear != null ? currentYear.hashCode() : 0);
        result = 31 * result + (yearOfGraduation != null ? yearOfGraduation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", currentYear='" + currentYear + '\'' +
                ", yearOfGraduation='" + yearOfGraduation + '\'' +
                '}';
    }
}
