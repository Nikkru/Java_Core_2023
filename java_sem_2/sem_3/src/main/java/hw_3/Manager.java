package hw_3;

import java.util.List;

public class Manager extends Employee {
    public Manager(String name, Position position, String phone_number, int salary, int age) {
        super(
                name,
                position,
                phone_number,
                salary,
                age);
    }
    static void upSalaryAfter45(List<Employee> arr) {
        for (Employee employee : arr)
            if ((employee.age > 45) && (employee.position != Position.MANAGER)) {
                employee.salary += 5000;
            }
    }
}
