package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 14. Предоставьте информацию о среднем возрасте сотрудников по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class AverageAgeByDepartmentTask14 implements TaskForHRM<Map<String, Double>>{
    @Override
    public Map<String, Double> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.averagingDouble(Employee::getAge))));
    }
}
