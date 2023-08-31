package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 9. Предоставьте информацию по числу женщин в каждом департаменте.
 *
 * @author Alexandr Korovkin
 */
public class AmountWomanOfDepartmentTask9 implements TaskForHRM<Map<String, Long>>{
    @Override
    public Map<String, Long> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream().filter(e -> !e.isMale()),
                                Collectors.counting())));
    }
}
