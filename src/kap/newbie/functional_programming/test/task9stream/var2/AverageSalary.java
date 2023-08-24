package kap.newbie.functional_programming.test.task9stream.var2;

import kap.newbie.functional_programming.test.task9stream.var1.Employee;

import java.util.List;

/**
 * Рассчитать среднюю зарплату всех сотрудников в списке.
 * @author Alexandr Korovkin
 */
public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("worker", 1500), new Employee("footman", 5000),
                                        new Employee("engineer", 3000));

        System.out.println(calculateAverageWithStream(list));;
    }

    public static double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }

    public static double calculateAverageWithStream(List<Employee> employeeList){
        return employeeList.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
    }
}
