package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 16. По каждой должности (position) предоставьте список сотрудников,
 * ее занимающих (допустимо ограничиться обозначением сотрудника по имени).
 *
 * @author Alexandr Korovkin
 */
public class PositionListEmployeesTask16 implements TaskForHRM<Map<String, List<String>>>{
    @Override
    public Map<String, List<String>> realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Employee::getPosition,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
    }
}
