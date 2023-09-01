package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 15. Предоставьте соотношение женщин и мужчин по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class MaleToFemaleRatioTask15 implements TaskForHRM<Map<String, Map<Boolean, Long>>>{
    @Override
    public Map<String, Map<Boolean, Long>> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.partitioningBy(Employee::isMale, Collectors.counting()))));
    }
}
