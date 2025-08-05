package employee_management;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */

    private final List<Employee> employeesList;
    private final String name;

    public Department(List<Employee> employees, String name) {
        this.employeesList = employees;
        this.name = name;

        Set<String> existedEmployee = new HashSet<>();

        for (Employee e : employeesList) {
            String key = e.getEmployeeId() + "_" + e.getName();
            if (existedEmployee.add(key)) {
                this.employeesList.add(e);
            }
        };
    }

    public List<Employee> getEmployees() {
        return employeesList;
    }

}
