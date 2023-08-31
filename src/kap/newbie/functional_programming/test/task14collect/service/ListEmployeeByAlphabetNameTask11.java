package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * Задача 11. Предоставьте список сотрудников по каждому имени.
 * Имена должны быть представлены в алфавитном порядке.
 *
 * @author Alexandr Korovkin
 */
public class ListEmployeeByAlphabetNameTask11 implements TaskForHRM<SortedMap<String, List<Employee>>>{
    @Override
    public SortedMap<String, List<Employee>> realize(List<Department> departments) {

        return departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getName,
                        TreeMap::new,
                        Collectors.toList()));
    }
}
