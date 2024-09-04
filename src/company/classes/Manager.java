package company.classes;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private String department;
    private List<Employee> employeeList;

    //konstruktor  klasy manger
    public Manager(String firstName, String lastName, int age, int salary, String department) {
        super(firstName, lastName, age, salary);
        this.department = department;
        employeeList = new ArrayList<>(); //bez this bo nie ejst przekazywany
    }

    //pobieranie wartosci department
    public String getDepartment() {
        return department;
    }

    //przydzielenie pracownika managerowi
    public void assignEmployee(Employee employee) {
        employeeList.add(employee);
    }

    //przedstawienie sie managera

    public void sayHello() {
        if (employeeList.isEmpty()) {
            System.out.println("Cześć, nazywam się " + firstName + " " + lastName +
                    ", mam " + age + " lat, zarabiam " + salary +
                    "zł, pracuję w dziale " + department + ", nie mam jeszcze żadnego podwładnego.");
        }else {
            System.out.println("Cześć, nazywam się " + firstName + " " + lastName +
                    ", mam " + age + " lat, zarabiam " + salary +
                    "zł, pracuję w dziale " + department + ", moimi podwładnymi są: ");
            for (Employee employee : employeeList) {
                System.out.println(employee.firstName + " " + employee.lastName);
            }
        }
    }
}


