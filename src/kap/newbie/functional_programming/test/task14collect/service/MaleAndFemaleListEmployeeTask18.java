package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 18. Предоставьте список сотрудников женского пола и сотрудников мужского пола в компании.
 *
 * @author Alexandr Korovkin
 */
public class MaleAndFemaleListEmployeeTask18 implements TaskForHRM<Map<Boolean, List<String>>>{
    @Override
    public Map<Boolean, List<String>> realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(Employee::isMale,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
    }
}
