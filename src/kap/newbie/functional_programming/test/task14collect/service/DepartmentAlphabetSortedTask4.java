package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Задача 4. Предоставьте список всех департаментов в алфавитном порядке в виде LinkedList.
 *
 * @author Alexandr Korovkin
 */
public class DepartmentAlphabetSortedTask4 implements TaskForHRM<LinkedList<String>>{
    @Override
    public LinkedList<String> realize(List<Department> departments) {
        return departments.stream()
                .map(Department::getName)
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
