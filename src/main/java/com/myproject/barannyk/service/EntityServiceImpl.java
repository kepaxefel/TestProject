package com.myproject.barannyk.service;

import com.myproject.barannyk.entity.Person;
import com.myproject.barannyk.repository.EntityRepository;

import java.util.List;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class EntityServiceImpl implements EntityService {

    private EntityRepository repository;

    public EntityServiceImpl(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveEntityList(List<Person> entityList) {
        repository.savePersonList(entityList);
    }
}
