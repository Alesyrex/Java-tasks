package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Задача 6. Предоставьте информацию о проценте открытых вакансий
 * относительно текущего числа сотрудников по каждому департаменту.
 *
 * @author Alexandr Korovkin
 */
public class OpenVacancyPercentTask6 implements TaskForHRM<Map<String, Double>>{
    @Override
    public Map<String, Double> realize(List<Department> departments) {
        return departments.stream()
                .collect(Collectors.toMap(Department::getName,
                        d -> (d.getVacancyAmount() - d.getEmployees().size())
                                /  ((double) d.getVacancyAmount() / 100)));
    }
}
