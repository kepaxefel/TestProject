package com.myproject.barannyk.repository;

import com.myproject.barannyk.entity.Person;

import java.util.List;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public interface EntityRepository {

    void savePerson(Person person);
    List<Person> getRepository();
    void savePersonList(List<Person> list);
}
