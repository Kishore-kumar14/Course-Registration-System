package com.example;

import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    int credits;

    Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
}

public class App {
    public static void main(String[] args) {
        String studentName = "Jane Doe";
        String studentID = "ID-5582";
        
        // FIX: Added <Course> inside the constructor brackets
        List<Course> courses = new ArrayList<Course>(); 
        
        courses.add(new Course("Mathematics", 4));
        courses.add(new Course("Physics", 4));
        courses.add(new Course("Programming", 5));
        courses.add(new Course("English", 3));

        int totalCredits = 0;
        for (Course c : courses) {
            totalCredits += c.credits;
        }

        boolean isEligible = totalCredits >= 15;

        System.out.println("--- Student Registration ---");
        System.out.println("Student: " + studentName + " (" + studentID + ")");
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Status: " + (isEligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
    }
}
