package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 24. Предоставьте информацию, превышает ли численность мужчин численность женщин по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class MaleOrFemaleByDepartmentTask24 implements TaskForHRM<Map<String, Boolean>>{
    @Override
    public Map<String, Boolean> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.teeing(Collectors.filtering(Employee::isMale, Collectors.counting()),
                                        Collectors.filtering(e -> !e.isMale(), Collectors.counting()),
                                        (m,f) -> m > f))));
    }
}
