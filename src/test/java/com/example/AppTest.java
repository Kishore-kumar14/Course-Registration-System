package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AppTest {

    /**
     * Test Case 1: Verifies that the summing logic is correct.
     */
    @Test
    public void testCalculateTotal() {
        // Sample array of credits
        int[] sampleCredits = new int[] {4, 4, 5, 3};
        
        // Total logic
        int result = 0;
        for (int i = 0; i < sampleCredits.length; i++) {
            result += sampleCredits[i];
        }

        // JUnit Assertion: (Expected, Actual)
        assertEquals("Total calculation should be 16", 16, result);
    }

    /**
     * Test Case 2: Verifies the eligibility threshold (15 credits).
     */
    @Test
    public void testEligibilityCheck() {
        int passCredits = 15;
        int failCredits = 14;

        // Condition: total >= 15
        boolean shouldPass = (passCredits >= 15);
        boolean shouldFail = (failCredits >= 15);

        // JUnit Assertions
        assertTrue("15 credits should pass eligibility", shouldPass);
        assertFalse("14 credits should fail eligibility", shouldFail);
    }
}
