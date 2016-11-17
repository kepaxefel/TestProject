package com.myproject.barannyk.parser;

import com.myproject.barannyk.entity.Person;

import java.util.List;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public interface Parser {

    List<Person> getEntityList(String filename, String group);
}
