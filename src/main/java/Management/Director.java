package Management;

public class Director extends Manager {
    
    private double budget;
    public Director(String name, String nationalNumber, int salary, String deptName, double budget) {
        super(name, nationalNumber, salary, deptName);
        this.budget = budget;
        
    }

    public double getBudget() {
        return budget;
    }
}
