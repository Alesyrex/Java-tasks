package kap.newbie.functional_programming.test.task14collect;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;
import kap.newbie.functional_programming.test.task14collect.service.CreateListDepartment;
import kap.newbie.functional_programming.test.task14collect.service.ListEmployeeTask;
import kap.newbie.functional_programming.test.task14collect.service.TaskForHRM;

import java.io.File;
import java.util.List;

/**
 *
 * Представим, что мы пытаемся реализовать набор функций для HRM-системы компании,
 * каждая из которых сводится к формированию определенной статистики на базе информации
 * о всех департаментах компании и сотрудниках в них. Реализация каждой задачи должна представлять
 * собой отдельный метод (или класс), единственным параметром которого является список
 * всех департаментов в компании, а возвращаемым значением – произвольный объект
 * (чаще всего – какая-то коллекция), хранящий информацию, которую требуется получить по условию задачи.
 *
 * @author Alexandr Korovkin
 */
public class HRMSystem {

    public static void main(String[] args) {
        List<Department> departments = CreateListDepartment.getDepartmentList();

        TaskForHRM<?> task = new ListEmployeeTask();

        List<Employee> employeeList = (List<Employee>) task.realize(departments);
        employeeList.forEach(e -> System.out.println(e.getName() + " - " + e.getPosition()));
    }
}
