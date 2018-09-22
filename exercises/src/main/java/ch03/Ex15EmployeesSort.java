package ch03;

import java.util.Arrays;
import java.util.Comparator;

public class Ex15EmployeesSort {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vasya", 100), new Employee("Dima", 50),
                new Employee("Katya", 100), new Employee("Roma", 50),
                new Employee("Petya", 150), new Employee("Eugene", 110)};
        System.out.println(Arrays.toString(employees));
        sort(employees);
        System.out.println(Arrays.toString(employees));

    }

    private static void sort(Employee[] employees) {
        Arrays.sort(
                employees,
                Comparator.comparingDouble(Employee::getMeasure).thenComparing(Employee::getName));
    }
}
