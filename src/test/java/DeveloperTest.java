import staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Timmy","F652124",30000);
    }
    @Test
    public void raiseSalary(){
        developer.raiseSalary(10.5);
        assertEquals(30010.5, developer.getSalary(),0.001);
    }
    @Test
    public void payBonus(){
        assertEquals(300, developer.payBonus(),0.001);
    }
    @Test
    public void hasName(){
        assertEquals("Timmy", developer.getName());
    }
    @Test
    public void canChangeNameIfNotNull(){
        developer.setName("Jeff");
        assertEquals("Jeff", developer.getName());
    }
    @Test
    public void cannnotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Timmy", developer.getName());
    }
}