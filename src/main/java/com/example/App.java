package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static class Subject {
        String name;
        int credits;

        public Subject(String name, int credits) {
            this.name = name;
            this.credits = credits;
        }
    }

    // Logic separated for JUnit testing
    public int calculateTotalCredits(List<Subject> subjects) {
        return subjects.stream().mapToInt(s -> s.credits).sum();
    }

    public boolean isEligible(int totalCredits) {
        return totalCredits >= 15;
    }

    public void runRegistration() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("--- Course Registration System ---");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        List<Subject> subjects = new ArrayList<>();
        System.out.print("How many subjects? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Subject Name: ");
            String subName = scanner.next();
            System.out.print("Credits: ");
            int subCredits = scanner.nextInt();
            subjects.add(new Subject(subName, subCredits));
        }

        int total = calculateTotalCredits(subjects);
        System.out.println("\nSummary for " + name + " (" + id + ")");
        System.out.println("Total Credits: " + total);
        System.out.println("Status: " + (isEligible(total) ? "ELIGIBLE" : "INELIGIBLE"));
    }

    public static void main(String[] args) {
        new App().runRegistration();
    }
}
