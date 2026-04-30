package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Person Sınıfı Testi ---");
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is teen: " + person.isTeen());

        // Farklı bir Person objesi oluşturma (Overloaded constructor testi)
        Person person2 = new Person("Jane", "Smith", 16, "jane@example.com", "Turkey", "Female");
        System.out.println("Person 2 Firstname: " + person2.getFirstName());
        System.out.println("Person 2 Is teen: " + person2.isTeen());

        System.out.println("\n--- Wall Sınıfı Testi ---");
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}