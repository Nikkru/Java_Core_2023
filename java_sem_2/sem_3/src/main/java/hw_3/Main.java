package hw_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Employee[] employees = new Employee[4];
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee_1 = new Employee(
                "Петров В.И.",
                Employee.Position.INTERN,
                "89058674565",
                50000,
                19);
        Employee employee_2 = new Employee(
                "Сидоров С.И.",
                Employee.Position.LEAD_PROGRAMMER,
                "89096766378",
                200000,
                47);
        Employee employee_3 = new Employee(
                "Николаев В.В.",
                Employee.Position.PROGRAMMER,
                "89056747463",
                100000,
                27);
        Employee employee_4 = new Employee(
                "Тамарина О.Л.",
                Employee.Position.DISIGNER,
                "89092147630",
                100000,
                24);
        Employee employee_5 = new Employee(
                "Сергеева Н.М.",
                Employee.Position.ACCOUNTANT,
                "89567176331",
                700000,
                47);
//В основной программе создайте руководителя и поместите его в общий массив сотрудников.
        Employee employee_6 = new Employee(
                "Иванов И.И.",
                Employee.Position.MANAGER,
                "89021345891",
                300000,
                50);

        employees.add(employee_1);
        employees.add(employee_2);
        employees.add(employee_3);
        employees.add(employee_4);
        employees.add(employee_5);
//В основной программе создайте руководителя и поместите его в общий массив сотрудников.
        employees.add(employee_6);

        System.out.println(employee_6);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        Manager.upSalaryAfter45(employees);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
    private void upSalary(Employee[] arr, int increase, int age) {
        for (Employee employee : arr)
            if (employee.age > age) {
                employee.salary += increase;
            }
    }
}
