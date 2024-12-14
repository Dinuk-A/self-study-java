package org.example.utils.jsonFilesHndl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class JsonExm {

    // serialization === convert a single java object into json string
    public static void createJsonObj() {

        // create a instance of a ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();

        // create a instance of a Person
        Person person = new Person("dinuka", 26);

        try {

            // convert and save
            String jsonString = objMapper.writeValueAsString(person);
            System.out.println("As JSON :" + jsonString);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // convert multiple java objects (collection)
    public static void createJsonArray() {

        // create a instance of a ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();

        // create an empty array
        ArrayList<Person> ppl = new ArrayList<>();

        // create multiple Person Objs at once
        for (int i = 0; i < 5; i++) {

            String name = "abc_" + i;
            int age = 25 + i;

            Person person = new Person(name, age);
            ppl.add(person);

        }

        try {

            // compact version
            String jsonArrayString = objMapper.writeValueAsString(ppl);

            // more clearer version (same thing, just the representation is prettier when
            // printed)
            String prettyJson = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ppl);

            System.out.println("Default print");
            System.out.println(jsonArrayString);
            System.out.println();
            System.out.println("Pretty print");
            System.out.println(prettyJson);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // eserialization === convert json to java
    public static void jsonToJavaSingleObj() {

        // sample json string
        String jsonString = "{\"name\":\"John Doe\",\"age\":30}";

        try {

            ObjectMapper objmppr = new ObjectMapper();
            Person person = objmppr.readValue(jsonString, Person.class);

            // The Person.class argument === specify the target type of the deserialized object , ===  tells Jackson which Java class the JSON data should map to.

            System.out.println(person);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
