import staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John","F952124",30000);
    }
    @Test
    public void raiseSalary(){
        databaseAdmin.raiseSalary(10.5);
        assertEquals(30010.5, databaseAdmin.getSalary(),0.001);
    }
    @Test
    public void payBonus(){
        assertEquals(300, databaseAdmin.payBonus(),0.001);
    }
    @Test
    public void hasName(){
        assertEquals("John", databaseAdmin.getName());
    }
}