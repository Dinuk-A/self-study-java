package org.example.utils.jsonFilesHndl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//for json example 2

@JsonIgnoreProperties(ignoreUnknown = true)  
//If the JSON contains extra fields, they will be ignored during deserialization
public class Animal {

    @JsonProperty("nameOfAnimal") // Maps the name in json file with this property name
    private String name;

    @JsonProperty("typeOfAnimal") // Maps the name in json file with this property name
    private String type;

    @JsonProperty("legs") // Maps the name in json file with this property name
    private int legsCount;

    @JsonIgnore //Prevents a specific field from being included in JSON serialization and deserialization
    private String sensitiveData;

    // constructors
    public Animal(String name, String type, int legsCount) {
        this.name = name;
        this.type = type;
        this.legsCount = legsCount;
    }

    public Animal() {
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    // geters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", type=" + type + " legscount = " + legsCount + " ]";
    }

}
