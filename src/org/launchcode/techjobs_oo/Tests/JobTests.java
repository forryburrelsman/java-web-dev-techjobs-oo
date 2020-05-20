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
        assertEquals(testJob.getId(), 4);
        //assertFalse(testJob.getId() != 1);
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

    @Test
    public void testBlankLinesInToString() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("\n"));
        assertTrue(testJob.toString().endsWith("\n"));
    }

    @Test
    public void testJobInfoToString() {
        // string should contain a label for each field followed by the data stored in that field
        // Each field should be on its own line.
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.toString(), ("\n" + "ID: " + testJob.getId() + "\n" +
                                "Name: "+ testJob.getName() + "\n" + "Employer: " + testJob.getEmployer() +
                                "\n" + "Location: " + testJob.getLocation() + "\n" + "Position Type: " +
                                testJob.getPositionType() + "\n" + "Core Competency: " +
                                testJob.getCoreCompetency() + "\n"));
        //System.out.println(testJob.toString());
    }

    @Test
    public void testEmptyFieldToString() {
        //if a field is empty, the method should add, “Data not available” after the label.
        Job testJob = new Job("Product tester", new Employer(""), new Location("location"), new PositionType(""), new CoreCompetency(""));
        System.out.println(testJob.toString());
        assertTrue(testJob.toString().contains("Data not available"));

    }

    @Test
    public void testJobDoesNotExist() {
        Job emptyTestJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        //System.out.println(testJob.toString());
        assertEquals(emptyTestJob.toString(), "\n OOPS! This job does not seem to exist.\n");
    }

}

