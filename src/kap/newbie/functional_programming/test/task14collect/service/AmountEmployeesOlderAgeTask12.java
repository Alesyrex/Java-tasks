package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 12. Предоставьте количество сотрудников старше 50 по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class AmountEmployeesOlderAgeTask12 implements TaskForHRM<Map<String, Long>>{
    public static final int AGE = 50;

    @Override
    public Map<String, Long> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.filtering(e -> e.getAge() > AGE, Collectors.counting()))));
    }
}
