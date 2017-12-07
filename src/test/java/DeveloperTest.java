import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Ben", "3eer4", 30000);
    }

    @Test
    public void getName(){
        assertEquals("Ben", developer.getName());
    }

    @Test
    public void getNatNumber(){
        assertEquals("3eer4", developer.getNatNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(30000, developer.getSalary());
    }


}
