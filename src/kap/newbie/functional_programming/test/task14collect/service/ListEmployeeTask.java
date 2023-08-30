package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class ListEmployeeTask implements TaskForHRM<List<Employee>>{
    @Override
    public List<Employee> realize(List<Department> departments) {
        return departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.toList());
    }
}
