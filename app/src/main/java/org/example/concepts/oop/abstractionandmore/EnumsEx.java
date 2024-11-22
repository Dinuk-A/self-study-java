package org.example.concepts.oop.abstractionandmore;

//num is a special "class" that represents a group of constants (unchangeable variables, like final variables).

//An enum cannot be used to create objects, and it cannot extend other classes === final and static
//(but it can implement interfaces).

public enum EnumsEx {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}

// IN APP

// access an enum
/*
 * EnumsEx myVar = EnumsEx.FRIDAY;
 * System.out.println(myVar);
 * 
 */

// enum values can be used in a switch
/*
 * EnumsEx myVar = EnumsEx.FRIDAY;
 * switch(myVar) {
 * case LOW:
 * System.out.println("Low level");
 * break;
 * case MEDIUM:
 * System.out.println("Medium level");
 * break;
 * case HIGH:
 * System.out.println("High level");
 * break;
 * }
 */

// loop through an enum
/*
 * for(EnumsEx myEnumVals : EnumsEx.values()){
 * System.out.println(myEnumVals);
 * }
 */

 
