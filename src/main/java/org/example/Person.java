package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;
    private String email;
    private String country;
    private String gender;

    // Birinci Constructor: 3 temel parametre
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // İkinci Constructor (Overloading): 6 parametre, this() ile birinci constructor'ı çağırma (Chaining)
    public Person(String firstname, String lastName, int age, String email, String country, String gender) {
        this(firstname, lastName, age);
        this.email = email;
        this.country = country;
        this.gender = gender;
    }

    // Metotlar
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}