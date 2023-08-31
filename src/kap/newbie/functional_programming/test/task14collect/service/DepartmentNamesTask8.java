package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Задача 8. Перечислите названия всех департаментов компании через запятую.
 *
 * @author Alexandr Korovkin
 */
public class DepartmentNamesTask8 implements TaskForHRM<String>{
    @Override
    public String realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getName)
                .collect(Collectors.joining(", "));
    }
}
