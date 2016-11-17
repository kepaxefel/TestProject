package com.myproject.barannyk.parser;

import com.myproject.barannyk.entity.Person;
import com.myproject.barannyk.entity.Student;
import com.myproject.barannyk.entity.Worker;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Roman_Barannyk on 11/17/2016.
 */
public class TestParsingFactory {

    private List<Person> actual;
    private Parser parser;
    private List<Person> expectedStudents;
    private List<Person> expectedWorkers;

    @Before
    public void setup() {
        parser = new ParserImpl();
        expectedStudents = new ArrayList<>();
        Student expectedStudent = Student.builder()
                .name("TestName")
                .lastName("TestLastName")
                .currentYear("testYear")
                .nameOfUniversity("testUniversity")
                .yearOfGraduation("testGrad").build();
        expectedStudents.add(expectedStudent);
        expectedWorkers = new ArrayList<>();
        Worker expectedWorker = Worker.builder()
                .name("testWorkerName")
                .lastName("testWorkerLastName")
                .position("testPosition")
                .experience("testExperience")
                .education("testEducation")
                .englishLevel("testLevel").build();
        expectedWorkers.add(expectedWorker);
    }

    @Test
    public void testShouldReturnStudent() {
        actual = parser.getEntityList("src/test/resources/testList.xml", "student");
        assertEquals(actual.get(0), expectedStudents.get(0));
    }

    @Test
    public void testShouldReturnWorker(){
        actual = parser.getEntityList("src/test/resources/testList.xml", "worker");
        assertEquals(actual.get(0), expectedWorkers.get(0));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowRuntimeException() throws RuntimeException {
        parser.getEntityList("src/test/resources/no.xml", "worker");
    }

}
