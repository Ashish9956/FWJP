package com.anudip.learning;
class Person{
   
    private String name = "John Doe";
    private int age = 30;
    private int salary = 50000;

    public static void main(String args[]) {
    /*if we modify the path. we get Error: Could not find or load main class Person
    Caused by: java.lang.NoClassDefFoundError: Person (wrong name: com/anudip/learning/Person) */
        System.out.println("Test Successful");
    }
}
