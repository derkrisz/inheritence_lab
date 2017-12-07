package Staff;

public class Employee {

    private String name;
    private String nationalNumber;
    private int salary;

    public Employee(String name, String nationalNumber, int salary){
        this.name = name;
        this.nationalNumber = nationalNumber;
        this.salary = salary;
    }
    

    public String getName() {
        return name;
    }

    public String getNatNumber() {
        return nationalNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void increaseSalary(double increase) {
        this.salary += increase;
    }
}
