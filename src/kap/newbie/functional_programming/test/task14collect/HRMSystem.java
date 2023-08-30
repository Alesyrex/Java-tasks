package kap.newbie.functional_programming.test.task14collect;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;
import kap.newbie.functional_programming.test.task14collect.service.ListEmployeeTask;
import kap.newbie.functional_programming.test.task14collect.service.TaskForHRM;

import java.util.Collection;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class HRMSystem {
    public static void main(String[] args) {
        List<Department> departments = List.of(null,null,null);

        TaskForHRM<?> task = new ListEmployeeTask();

        List<Employee> employeeList = (List<Employee>) task.realize(departments);
    }
}
