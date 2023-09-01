package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 21. Предоставьте информацию по минимальному, максимальному
 * и среднего возрасту сотрудников на каждой должности.
 *
 * @author Alexandr Korovkin
 */
public class StatisticAgeByPositionTask21 implements TaskForHRM<Map<String, DoubleSummaryStatistics>>{
    @Override
    public Map<String, DoubleSummaryStatistics> realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Employee::getPosition,
                        Collectors.summarizingDouble(Employee::getAge)));
    }
}
