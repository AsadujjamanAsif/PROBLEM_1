abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Abstract method to display employee information
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double baseSalary;

    public Manager(String name, int employeeId, double baseSalary) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        // For Manager, salary includes base salary plus bonus
        double bonus = 0.1 * baseSalary; // Assuming 10% bonus
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: Manager");
        System.out.println("Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // For Programmer, salary is calculated based on hours worked
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: Programmer");
        System.out.println("Salary: $" + calculateSalary());
    }
}
