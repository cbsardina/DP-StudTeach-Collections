package com.sardina;

import java.util.Random;

public class Student {

    String firstName;
    String lastName;
    String id;
    int grade;

    public void Student(String firstName, String lastName, String id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public int getGrade() { return grade; }

    public void setGrade(int grade) { this.grade = grade; }

    //generate random student id's
    public String makeID(String lastName) {
        Random random = new Random();
        int idNum = random.nextInt(10000);
        return lastName + Integer.toString(idNum); }

}
