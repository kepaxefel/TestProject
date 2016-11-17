package com.myproject.barannyk.repository;

import com.myproject.barannyk.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class EntityRepositoryImpl implements EntityRepository {

    private List<Person> repository = new ArrayList<>();

    @Override
    public void savePerson(Person person) {
        repository.add(person);
    }

    @Override
    public List<Person> getRepository(){
        return repository;
    }

    @Override
    public void savePersonList(List<Person> list){
        repository.addAll(list);
    }
}
