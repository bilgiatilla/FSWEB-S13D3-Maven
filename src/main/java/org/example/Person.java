package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private boolean adult;
    private String gender;
    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, int age, String address, boolean adult, String gender) {
        this(firstName, lastName, age);
        this.address = address;
        this.adult = adult;
        this.gender = gender;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public String getLastName () {
        return this.lastName;
    }
    public int getAge () {
        return this.age;
    }
    public boolean isTeen () {
        return age >= 13 && age <= 19;
        }
    }
