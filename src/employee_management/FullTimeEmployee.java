package employee_management;

public class FullTimeEmployee extends Employee {
    protected double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId,name);
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }

    public double calculateTax(){
        return (monthlySalary * 20) / 100;
    }
}

