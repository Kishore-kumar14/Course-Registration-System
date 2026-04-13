package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void testCalculateTotalCredits() {
        App app = new App();
        List<App.Subject> subjects = Arrays.asList(
            new App.Subject("Java", 5),
            new App.Subject("Database", 5),
            new App.Subject("Web", 6)
        );

        assertEquals(16, app.calculateTotalCredits(subjects), "Total credits should be 16");
    }

    @Test
    public void testEligibilityThreshold() {
        App app = new App();
        
        assertTrue(app.isEligible(15), "15 credits should be eligible");
        assertTrue(app.isEligible(20), "More than 15 credits should be eligible");
        assertFalse(app.isEligible(14), "Less than 15 credits should be ineligible");
    }
}
