package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public interface TaskForHRM<T> {
    T realize(List<Department> departments);
}
