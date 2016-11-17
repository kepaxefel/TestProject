package com.myproject.barannyk;

import com.myproject.barannyk.parser.Parser;
import com.myproject.barannyk.parser.ParserImpl;
import static com.myproject.barannyk.utils.Constants.*;

/**
 * Created by Roman_Barannyk on 11/16/2016.
 */
public class Demo {

    public static void main(String[] args){
        Parser parser = new ParserImpl();
        parser.getEntityList(XML_PATH, GROUP_STUDENT);
        parser.getEntityList(XML_PATH, GROUP_WORKER);
    }
}
