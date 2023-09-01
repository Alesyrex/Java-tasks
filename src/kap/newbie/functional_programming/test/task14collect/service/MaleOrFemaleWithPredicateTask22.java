package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Задача 22. Предоставьте список всех сотрудников женского пола, если их больше 10,
 * в противном случае – предоставьте список всех сотрудников мужского пола.
 *
 * @author Alexandr Korovkin
 */
public class MaleOrFemaleWithPredicateTask22 implements TaskForHRM<List<String>>{
    @Override
    public List<String> realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.teeing(Collectors.filtering(Employee::isMale,
                        Collectors.mapping(Employee::getName, Collectors.toList())),
                        Collectors.filtering(e -> !e.isMale(),
                                Collectors.mapping(Employee::getName, Collectors.toList())),
                        (m,f) -> f.size() > 10 ? f : m));
    }
}
