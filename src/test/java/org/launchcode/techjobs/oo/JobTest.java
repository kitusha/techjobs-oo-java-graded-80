package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

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
        // Ensure that the constructor correctly assigns values to all fields
        assertEquals("Software Developer", job2.getName());
        assertEquals("LaunchCode", job2.getEmployer().getValue());
        assertEquals("St. Louis", job2.getLocation().getValue());
        assertEquals("Full Time", job2.getPositionType().getValue());
        assertEquals("Java", job2.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Ensure that two jobs with the same ID are considered equal
        assertFalse(job1.equals(job2)); // IDs should be different
        assertTrue(job1.equals(job1)); // An object should be equal to itself
    }

    // Add more tests as needed to thoroughly test your Job class
}
