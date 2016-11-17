package com.myproject.barannyk.parser;

import com.myproject.barannyk.entity.Person;
import com.myproject.barannyk.exception.ParserRuntimeException;
import com.myproject.barannyk.factory.ParsingFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.myproject.barannyk.utils.Constants.*;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class ParserImpl implements Parser {

    private static final Logger LOG = Logger.getLogger(ParserImpl.class);

    public List<Person> getEntityList(String filename, String group) {
        List<Person> listPerson = new ArrayList<>();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            File inputFile = new File(filename);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName(group);
            Optional.ofNullable(nodeList).ifPresent(nodes ->
            {
                for (int currentNumber = 0; currentNumber < nodeList.getLength(); currentNumber++) {
                    Node currentNode = nodeList.item(currentNumber);
                    addToList(currentNode, listPerson, group);
                }
            });
        } catch (SAXException | ParserConfigurationException e) {
            LOG.error(e.getMessage());
            throw new ParserRuntimeException(PARSE_ERROR, e);
        } catch (IOException e) {
            LOG.error(e.getMessage());
            throw new RuntimeException(e);
        }
        return listPerson;
    }

    private void addToList(Node currentNode, List<Person> listPerson, String group ) {
        if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
            Element currentElement = (Element) currentNode;
            Person currentPerson = ParsingFactory.getInstance(currentElement, group);
            currentPerson.setName(currentElement.getElementsByTagName(PERSON_NAME).item(0).getTextContent());
            currentPerson.setLastName(currentElement.getElementsByTagName(PERSON_LASTNAME).item(0).getTextContent());
            listPerson.add(currentPerson);
        }
    }
}
