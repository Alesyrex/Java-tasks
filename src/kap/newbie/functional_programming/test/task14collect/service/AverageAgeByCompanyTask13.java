package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.List;

/**
 *
 * Задача 13. Предоставьте информацию о среднем возрасте сотрудников компании.
 *
 * @author Alexandr Korovkin
 */
public class AverageAgeByCompanyTask13 implements TaskForHRM<Double>{
    @Override
    public Double realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .mapToInt(Employee::getAge)
                .average().orElseThrow();
    }
}
