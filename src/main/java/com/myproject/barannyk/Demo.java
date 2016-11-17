package com.myproject.barannyk;

import com.myproject.barannyk.entity.Person;
import com.myproject.barannyk.parser.Parser;
import com.myproject.barannyk.parser.ParserImpl;
import com.myproject.barannyk.repository.EntityRepository;
import com.myproject.barannyk.repository.EntityRepositoryImpl;
import com.myproject.barannyk.service.EntityService;
import com.myproject.barannyk.service.EntityServiceImpl;

import java.util.List;

import static com.myproject.barannyk.utils.Constants.*;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class Demo {

    public static void main(String[] args){
        Parser parser = new ParserImpl();
        EntityRepository repository = new EntityRepositoryImpl();
        EntityService service = new EntityServiceImpl(repository);
        List<Person> students = parser.getEntityList(XML_PATH, GROUP_STUDENT);
        List<Person> workers = parser.getEntityList(XML_PATH, GROUP_WORKER);
        service.saveEntityList(students);
        service.saveEntityList(workers);
    }
}
