package hw_3;

public class Employee {

    public enum Position {
        MANAGER {
            @Override
            public String asLowerCase() {
                return MANAGER.toString().toLowerCase();
                }
            },
        PROGRAMMER {
            @Override
            public String asLowerCase() {
                return PROGRAMMER.toString().toLowerCase();
            }
        },
        LEAD_PROGRAMMER {
            @Override
            public String asLowerCase() {
                return LEAD_PROGRAMMER.toString().toLowerCase();
            }
        },
        DISIGNER {
            @Override
            public String asLowerCase() {
                return DISIGNER.toString().toLowerCase();
            }
        },
        ACCOUNTANT {
            @Override
            public String asLowerCase() {
                return ACCOUNTANT.toString().toLowerCase();
            }
        },
        INTERN {
            @Override
            public String asLowerCase() {
                return INTERN.toString().toLowerCase();
            }
        }
        ;
        public abstract String asLowerCase();
    }
    String name;
    Position position;
    String phone_number;
    int salary;
    int age;

    public Employee(String name, Position position, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

//    static void upSalaryAfter45(Employee[] arr) {
//        for (Employee employee : arr)
//            if (employee.age > 45) {
//                employee.salary += 5000;
//            }
//    }
    @Override
    public String toString() {
        return String.format(
                "Сотрудник %s. Должность: %s, номер телефона: %s, оклад: %d, возраст: %d",
                name,
                position,
                phone_number,
                salary,
                age);
    }
}
