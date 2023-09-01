package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 20. Предоставьте информацию по разнице в возрасте
 * между самым молодым и самым старым сотрудником по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class YoungerAndOlderRatioTask20 implements TaskForHRM<Map<String, Integer>>{
    @Override
    public Map<String, Integer> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.teeing(Collectors.mapping(Employee::getAge,
                                        Collectors.maxBy(Integer::compare)),
                                        Collectors.mapping(Employee::getAge,
                                                Collectors.minBy(Integer::compare)),
                                        (max, min) -> max.get() - min.get()))));

    }
}
