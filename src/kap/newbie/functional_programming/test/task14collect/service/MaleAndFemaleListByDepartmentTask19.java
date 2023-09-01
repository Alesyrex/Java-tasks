package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 19. Предоставьте список сотрудников женского пола и сотрудников мужского пола по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class MaleAndFemaleListByDepartmentTask19 implements TaskForHRM<Map<String, Map<Boolean, List<String>>>>{
    @Override
    public Map<String, Map<Boolean, List<String>>> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.partitioningBy(Employee::isMale,
                                        Collectors.mapping(Employee::getName, Collectors.toList())))));
    }
}
