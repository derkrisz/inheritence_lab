import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager  = new Manager("John", "d0d0", 300000, "Edinburgh");
    }

    @Test
    public void getDeptName(){
        assertEquals("Edinburgh", manager.getDeptName());
    }
}
