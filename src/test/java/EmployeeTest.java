import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Alex", "2dd33", 25000);
    }


    @Test
    public void getName(){
        assertEquals("Alex", employee.getName());
    }

    @Test
    public void getNatNumber(){
        assertEquals("2dd33", employee.getNatNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(25000, employee.getSalary());
    }

    @Test
    public void raiseSalary(){
        employee.increaseSalary(10000);
        assertEquals(35000, employee.getSalary());
    }


}
