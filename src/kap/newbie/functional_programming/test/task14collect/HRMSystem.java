package kap.newbie.functional_programming.test.task14collect;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;
import kap.newbie.functional_programming.test.task14collect.service.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public static final String DELIMITER = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    public static void main(String[] args) {
        List<Department> departments = CreateListDepartment.getDepartmentList();

        TaskForHRM<?> task = new ListEmployeeTask1();

        List<Employee> employeeList = (List<Employee>) task.realize(departments);
        employeeList.forEach(e -> System.out.println(e.getName() + " - " + e.getPosition()));

        System.out.println(DELIMITER);

        task = new DistinctEmployeeNameTask2();
        Set<String> nameSet = (Set<String>) task.realize(departments);

        nameSet.forEach(System.out::println);

        System.out.println(DELIMITER);

        task = new DistinctEmployeeNameByDepartTask3();
        Map<String, List<String>> empNameByDep = (Map<String, List<String>>) task.realize(departments);

        empNameByDep.forEach((s,l) -> { System.out.println(s + ":");
                                        l.forEach(System.out::println);});

        System.out.println(DELIMITER);

        task = new DepartmentAlphabetSortedTask4();
        LinkedList<String> listDepSort = (LinkedList<String>) task.realize(departments);
        listDepSort.forEach(System.out::println);

        System.out.println(DELIMITER);

        
    }
}
