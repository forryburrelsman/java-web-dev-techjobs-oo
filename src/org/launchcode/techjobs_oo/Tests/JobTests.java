package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

public class JobTests {
//Job testJob;
//Job testJobTwo;
//    @Before
//    public void createJobObject() {
//        Job testJob = new Job();
//        Job testJobTwo = new Job();
//    }

    @Test
    public void testSettingJobId() {
            Job testJobOne = new Job();
            Job testJobTwo = new Job();
        int iDOne = testJobOne.getId();
        int iDTwo = testJobTwo.getId();
        testJobTwo.getId();
        assertTrue(iDOne + 1 == iDTwo);
        assertFalse(iDOne == iDTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() == "Product tester");
        assertTrue(testJob.getEmployer().getValue() == "ACME");
        assertTrue(testJob.getLocation().getValue() == "Desert");
        assertTrue(testJob.getPositionType().getValue() == "Quality control");
        assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");
        assertTrue(testJob.getId() == 1);
        assertFalse(testJob.getId() != 1);
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJobOne.equals(testJobTwo));
    }

}

