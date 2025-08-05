package employee_management;

public abstract class Employee {
    private int employeeId;
    private String name;
    private int employeeIdCounter;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Employee(String name){
        this.employeeId = employeeIdCounter++;
        this.name = name;
    }

    public abstract double calculatePay();

    public abstract double calculateTax();
}
