package org.example.concepts.oop.classesobjects;

//ENCAPSULATION
//used when attributes are private/protected & needed security

public class SettersNGettersEx {

    private int number;
    private String companyName;

    // getters
    public int getNumber() {
        return number;
    }

    public String getCompanyName() {
        return companyName;
    }

    // setters
    public void setNumber(int numberValueOfObj) {
        this.number = numberValueOfObj;
    }

    public void setCompanyName(String companyNameValOfObj) {
        this.companyName = companyNameValOfObj;
    }

    // set the values of a default constructor using setters
    // SettersNGettersEx newObj = new SettersNGettersEx();
    // newObj.setNumber(25);
    // newObj.setCompanyName("ABC");
    // newObj.number = 25; will give an error

    // get the current value of currently refering object using getters
    // System.out.println("Name: " + newObj.getNumber());
    // System.out.println(newObj.number) will give an error

}
