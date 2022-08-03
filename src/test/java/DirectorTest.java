import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Michael", "FP02314",559000,"Management",120000);

    }
    @Test
    public void hasBudget(){
        assertEquals(120000, director.getBudget(), 0.0001);
    }
    @Test
    public void doesNotRaiseByNegative(){
        director.raiseSalary(-5000);
        assertEquals(559000,director.getSalary(),0.0001);
    }
    @Test
    public void bonusBy2Percent(){
        assertEquals(11180, director.payBonus(),0.001);
    }
}
