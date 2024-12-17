package org.example.utils.jsonFilesHndl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

//different scenarios with json to classes 
public class JsonExmWClzsTwo {
    
    //1
    //if the propeerty names in class is different from json file's key names

    //in the class, mark the properties with some annotations to match these names with actual propety names in class
    public static void difProertyNames() {

        String jsonString = "{\"nameOfAnimal\":\"Larry\",\"typeOfAnimal\":\"Cat\",\"legs\":4}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Animal animal = mapper.readValue(jsonString, Animal.class);
            System.out.println(animal);
        } catch (Exception e) {
            System.out.println("errorrrrrrrrr");
            e.printStackTrace();
        }
       
        
    }

    //2
    //if json has an extra property which is not in the class
    // use @JsonIgnoreProperties(ignoreUnknown = true) on the top of class
    public static void jsonHasExtraField(){

        String jsonString = "{\"nameOfAnimal\":\"Larry\",\"typeOfAnimal\":\"Cat\",\"legs\":4,\"extraField\":\"a value\"}";

        ObjectMapper mapper = new ObjectMapper();

        try {

            Animal animal = mapper.readValue(jsonString, Animal.class);
            System.out.println(animal);

        } catch (Exception e) {

            System.out.println("errorrrrrrrrr");
            e.printStackTrace();

        }


    }

    //3
    //if java class has extra property thats not in json
    //it will give 0 for int values and null for primitive values
    public static void javaClzHAsExxtraProperty() {
        
        //legs removed
        String jsonString = "{\"nameOfAnimal\":\"Larry\",\"typeOfAnimal\":\"Cat\"}";

        ObjectMapper mapper = new ObjectMapper();

        try {
            
            Animal animal = mapper.readValue(jsonString, Animal.class);
            System.out.println(animal);
            
        } catch (Exception e) {
           e.printStackTrace();
        }

    }

}


