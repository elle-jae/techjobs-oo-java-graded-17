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


//        String msg2 = "constructor fields have correct values.";
//   String expected = "Product tester";
//   String actual = job.getName();
//    assertEquals(msg2, expected, actual);
//    assertEquals(msg2, "ACME", job.getEmployer());
//    assertEquals(msg2, "Desert", job.getLocation());
//    assertEquals(msg2, "Quality control", job.getPositionType());
//    assertEquals(msg2, "Persistence", job.getCoreCompetency());
    }

@Test
    public void testJobsForEquality() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertFalse(job1.getId() == job2.getId());
    }
}
