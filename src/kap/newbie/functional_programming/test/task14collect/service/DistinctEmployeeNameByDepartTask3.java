package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задача 3. Предоставьте полный перечень оригинальных имен сотрудников по каждому департаменту.
 * Здесь и далее: допустимо ограничиться обозначением департамента по названию.
 *
 * @author Alexandr Korovkin
 */
public class DistinctEmployeeNameByDepartTask3 implements TaskForHRM<Map<String, List<String>>>{
    @Override
    public Map<String, List<String>> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.groupingBy(Department::getName,
                        Collectors.flatMapping(d -> d.getEmployees().stream(),
                                Collectors.mapping(Employee::getName, Collectors.toList()))));
    }
}
