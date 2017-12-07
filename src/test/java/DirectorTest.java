import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jack", "123da", 45000, "Glasgow", 20000);
    }

    @Test
    public void getBudget(){
        assertEquals(20000, director.getBudget(), 0.01);
    }

}
