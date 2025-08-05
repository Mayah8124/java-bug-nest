package employee_management;

public class PartTimeEmployee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

