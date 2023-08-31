package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * Задача 2. Предоставьте полный перечень оригинальных имен сотрудников компании.
 *
 * @author Alexandr Korovkin
 */
public class DistinctEmployeeNameTask implements TaskForHRM<Set<String>>{
    @Override
    public Set<String> realize(List<Department> departments) {
        return departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .map(Employee::getName)
                .collect(Collectors.toSet());
    }
}
