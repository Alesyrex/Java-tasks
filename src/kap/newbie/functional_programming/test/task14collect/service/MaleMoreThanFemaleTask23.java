package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Задача 23. Предоставьте информацию, превышает ли численность мужчин в компании численность женщин.
 *
 * @author Alexandr Korovkin
 */
public class MaleMoreThanFemaleTask23 implements TaskForHRM<Boolean>{
    @Override
    public Boolean realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.teeing(Collectors.filtering(Employee::isMale, Collectors.counting()),
                        Collectors.filtering(e -> !e.isMale(), Collectors.counting()),
                        (m,f) -> m > f));
    }
}
