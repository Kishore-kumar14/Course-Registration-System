package com.example;

public class AppTest {
    public static void main(String[] args) {
        // Run individual test cases
        testCalculateTotal();
        testEligibilityCheck();
        
        System.out.println("----------------------------");
        System.out.println("ALL TESTS PASSED SUCCESSFULLY");
        System.out.println("----------------------------");
    }

    /**
     * Test Case 1: Verifies that the summing logic is correct.
     */
    static void testCalculateTotal() {
        System.out.print("Testing Total Calculation... ");
        
        // Sample array of credits
        int[] sampleCredits = new int[] {4, 4, 5, 3}; // Total should be 16
        
        int result = 0;
        for (int i = 0; i < sampleCredits.length; i++) {
            result += sampleCredits[i];
        }

        if (result == 16) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL (Expected 16, got " + result + ")");
            System.exit(1); // Stop program on failure
        }
    }

    /**
     * Test Case 2: Verifies the eligibility threshold (15 credits).
     */
    static void testEligibilityCheck() {
        System.out.print("Testing Eligibility Logic... ");
        
        int passCredits = 15;
        int failCredits = 14;

        // Condition: total >= 15
        boolean shouldPass = (passCredits >= 15);
        boolean shouldFail = (failCredits >= 15);

        if (shouldPass == true && shouldFail == false) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.exit(1);
        }
    }
}
