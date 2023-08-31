package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Задача 5. Предоставьте самого старшего обладателя каждого из имен.
 * Попробуйте сделать это без использования downstream.
 *
 * @author Alexandr Korovkin
 */
public class OlderEmployeeByNameTask5 implements TaskForHRM<Map<String, Integer>>{
    @Override
    public Map<String, Integer> realize(List<Department> departments) {
        return departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.toMap(Employee::getName, Employee::getAge, (a1, a2) -> a1 > a2 ? a1 : a2));
    }
}
