import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Toby","F352124",31000,"Management");
    }
    @Test
    public void raiseSalary(){
        manager.raiseSalary(10.5);
        assertEquals(31010.5, manager.getSalary(),0.001);
    }
    @Test
    public void payBonus(){
        assertEquals(310, manager.payBonus(),0.001);
    }
}
