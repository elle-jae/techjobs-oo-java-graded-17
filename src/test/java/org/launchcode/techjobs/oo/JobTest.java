package org.launchcode.techjobs.oo;
 import org.junit.Test;
 import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
Job job1 = new Job();
Job job2 = new Job();

String msg = "empty constructor sets different ids";
int expectedJob1 = job1.getId();
int actualJob2 = job2.getId();
        assertNotEquals(msg, expectedJob1, actualJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       String msg1 = "classes of constructor are correct.";
    assertTrue(msg1, job.getName() instanceof String);
    assertTrue(msg1, job.getEmployer() instanceof Employer);
    assertTrue(msg1, job.getLocation() instanceof Location);
    assertTrue(msg1, job.getPositionType() instanceof PositionType);
    assertTrue(msg1, job.getCoreCompetency() instanceof CoreCompetency);


        String msg2 = "constructor fields have correct values.";
   String expected = "Product tester";
   String actual = job.getName();

    assertEquals(msg2, expected, actual);
    assertEquals(msg2, "ACME", job.getEmployer().getValue());
    assertEquals(msg2, "Desert", job.getLocation().getValue());
    assertEquals(msg2, "Quality control", job.getPositionType().getValue());
    assertEquals(msg2, "Persistence", job.getCoreCompetency().getValue());
    }

@Test
    public void testJobsForEquality() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
String msg = "check for line break before and after job info";
String expected = System.lineSeparator() +
        "ID:  _______\n" +
        "Name: _______\n" +
        "Employer: _______\n" +
        "Location: _______\n" +
        "Position Type: _______\n" +
        "Core Competency: _______\n" +
        System.lineSeparator();
        String actual = job.toString();
        assertEquals(msg, actual, expected);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
String msg = "toString() includes correct labels and data";
String expected = System.lineSeparator() +
        "ID:" + job.getId() + "\n" +
        "Name:" + job.getName() + "\n" +
        "Employer:" + job.getEmployer() + "\n" +
        "Location:" + job.getLocation() + "\n" +
        "Position Type:" + job.getName() + "\n" +
        "Core Competency:" +  job.getCoreCompetency() + "\n" +
        System.lineSeparator();
String actual = job.toString();
assertEquals(msg, expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
job.toString();

        String msg = "toString() handles empty field with 'Data not available'";
        String expected = "Data not available";
        String actual = job.getEmployer().getValue();

        assertEquals(msg, expected, actual);
    }

    @Test
    public void testIfOnlyIDFieldHasAValue() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
job.toString();

    String msg = "toString() handles if only the ID Field has a value by returning, 'OOPS! This job does not seem to exist.'";
    String expected = "OOPS! This job does not seem to exist.";
    String actual = job.toString();
    assertEquals(msg, expected, actual);

    }
    }


