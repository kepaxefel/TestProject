package com.myproject.barannyk.factory;

import com.myproject.barannyk.entity.Person;
import com.myproject.barannyk.entity.Student;
import com.myproject.barannyk.entity.Worker;
import org.w3c.dom.Element;

import static com.myproject.barannyk.utils.Constants.*;


/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class ParsingFactory {

    public static Person getInstance(Element element, String group) {
        if (group.equals(GROUP_STUDENT)) {
            return createStudent(element);
        }
        return createWorker(element);
    }

    private static Person createStudent(Element element){
        Student student = Student.builder()
                .nameOfUniversity(element.getElementsByTagName(STUDENT_UNIVERSITY).item(0).getTextContent())
                .currentYear(element.getElementsByTagName(STUDENT_CURRENT_YEAR).item(0).getTextContent())
                .yearOfGraduation(element.getElementsByTagName(STUDENT_GRADUATION).item(0).getTextContent()).build();
        return student;
    }

    private static Person createWorker(Element element){
        Worker worker = Worker.builder()
                .position(element.getElementsByTagName(WORKER_POSITION).item(0).getTextContent())
                .education(element.getElementsByTagName(WORKER_EDUCATION).item(0).getTextContent())
                .experience(element.getElementsByTagName(WORKER_EXPERIENCE).item(0).getTextContent())
                .englishLevel(element.getElementsByTagName(WORKER_ENGLISH_LEVEL).item(0).getTextContent()).build();
        return worker;
    }
}
