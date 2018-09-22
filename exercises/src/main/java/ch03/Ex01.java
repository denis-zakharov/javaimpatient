package ch03;

class Employee implements Measurable {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    void raiseSalary(double percent) {
        salary += salary / 100 * percent;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Ex01 {

    private static double average(Measurable[] objects) {
        double result = 0;
        if (objects.length == 0) return result;
        for (Measurable obj : objects) {
            result += obj.getMeasure();
        }
        return result / objects.length;
    }

    private static Measurable largest(Measurable[] objects) {
        double max = 0;
        Measurable largest = null;
        for (Measurable obj : objects) {
            double measure = obj.getMeasure();
            if (measure >= max) {
                largest = obj;
                max = measure;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee("Vasya", 100), new Employee("Dima", 50),
                new Employee("Petya", 150), new Employee("Eugene", 110)};

        System.out.println(average(employees));
        Measurable highestSalaryEmployee = largest(employees);
        if (highestSalaryEmployee instanceof Employee) {
            System.out.println(((Employee) highestSalaryEmployee).getName());
        }
    }
}
