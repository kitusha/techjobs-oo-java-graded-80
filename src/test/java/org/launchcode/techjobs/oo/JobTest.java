package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    private Job job1;
    private Job job2;

    @Before
    public void setUp() {
        job1 = new Job();
        job2 = new Job("Software Developer", new Employer("LaunchCode"), new Location("St. Louis"),
                new PositionType("Full Time"), new CoreCompetency("Java"));
    }

    @Test
    public void testSettingJobId() {
        // Ensure that the second job's ID is one greater than the first job's ID
        assertEquals(job1.getId() + 1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Create a new Job object with specified data
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals to test each field
        assertTrue(testJob instanceof Job);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Generate two Job objects that have identical field values except for id
        Job job3 = new Job("Software Developer", new Employer("LaunchCode"), new Location("St. Louis"),
                new PositionType("Full Time"), new CoreCompetency("Java"));

        // Test that equals returns false
        assertFalse(job2.equals(job3));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Test that toString starts and ends with a new line
        String toStringResult = job2.toString();
        assertTrue(toStringResult.startsWith(System.lineSeparator()));
        assertTrue(toStringResult.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Test that toString contains correct labels and data

    }

    @Test
    public void testToStringHandlesEmptyField() {
        // Test that toString handles empty fields correctly
        // Implement this test and make sure it fails initially
    }

    // Add more tests as needed to thoroughly test your Job class
}
