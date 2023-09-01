package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * Задача 17. Предоставьте информацию по максимальному возрасту сотрудников в каждом из департаментов.
 *
 * @author Alexandr Korovkin
 */
public class MaxOlderByDepartmentTask17 implements TaskForHRM<Map<String, Optional<Integer>>>{
    @Override
    public Map<String, Optional<Integer>> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.mapping(Employee::getAge,
                                        Collectors.maxBy(Integer::compare)))));
    }
}
