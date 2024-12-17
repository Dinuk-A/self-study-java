package org.example;

import org.example.concepts.basics.DataTypesExm;
import org.example.concepts.basics.InnOutEx;
import org.example.concepts.basics.StringsExm;
import org.example.concepts.collections.ArrayListsEx;
import org.example.concepts.collections.LinkedListEx;
import org.example.concepts.collections.MultiDimArrays;
import org.example.concepts.collections.NormalArrayEx;
import org.example.concepts.collections.StacksEx;
import org.example.concepts.collections.StreamsExm;
import org.example.concepts.files.DeleteFiles;
import org.example.concepts.files.FileHandle;
import org.example.concepts.files.FileMethodsGPT;
import org.example.concepts.files.ReadFiles;
import org.example.concepts.oop.abstractionandmore.AbsChild;
import org.example.concepts.oop.abstractionandmore.EnumsEx;
import org.example.concepts.oop.classesobjects.ClzNObjsEx;
import org.example.concepts.oop.classesobjects.InnerClzExm;
import org.example.concepts.oop.inheritanceExamples.Animal;
import org.example.concepts.oop.inheritanceExamples.Bird;
import org.example.concepts.oop.polyEx.Employee;
import org.example.concepts.oop.polyEx.Human;
import org.example.utils.jsonnnn.JSONObjectExm;
import org.example.utils.jsonnnn.JsonExmWClzsTwo;
import org.example.utils.jsonnnn.JsonExmWithClass;
import org.example.utils.jsonnnn.JsonWHashMap;
import org.example.utils.mapss.HashMapsEx;

public class App {

    // MAIN METHOD
    public static void main(String[] args) {

        start();

        welcome("Programmer");

        System.out.println(getGreeting("Developer"));

        System.out.println("==================================");

        // ############### TESTING PRACTICLES GO BELOW  ###############
       JSONObjectExm.createJsonArray();

        System.out.println("==================================");

    }

    // FIRST METHOD (SHOW APP HAS STARTED)
    public static void start() {
        System.out.println("Application Has Started");
    }

    // PASSING A VALUE
    public static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    // SHOWCASE THE USE OF RETURN
    public static String getGreeting(String name) {
        return "Hello " + name;
    }

}
