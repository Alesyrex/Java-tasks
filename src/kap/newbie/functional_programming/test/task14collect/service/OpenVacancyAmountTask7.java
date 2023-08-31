package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;

/**
 *
 * Задача 7. Предоставьте общее число открытых вакансий в компании.
 *
 * @author Alexandr Korovkin
 */
public class OpenVacancyAmountTask7 implements TaskForHRM<Integer>{
    @Override
    public Integer realize(List<Department> departments) {
        return departments.stream()
                .mapToInt(d -> d.getVacancyAmount() - d.getEmployees().size())
                .sum();
    }
}
