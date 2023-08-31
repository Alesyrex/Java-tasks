package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 10. Предоставьте список сотрудников по каждому имени.
 *
 * @author Alexandr Korovkin
 */
public class ListEmployeeByNameTask10 implements TaskForHRM<Map<String, List<Employee>>>{
    @Override
    public Map<String, List<Employee>> realize(List<Department> departments) {
        return departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getName));
    }
}
