package kap.newbie.functional_programming.test.task14collect;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;
import kap.newbie.functional_programming.test.task14collect.service.*;

import java.util.*;

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

        task = new OlderEmployeeByNameTask5();
        Map<String, Integer> olderByName = (Map<String, Integer>) task.realize(departments);
        olderByName.forEach((k,v) -> System.out.println(k + " : " + v + " years"));

        System.out.println(DELIMITER);

        task = new OpenVacancyPercentTask6();
        Map<String, Double> percentOfOpenVacancy = (Map<String, Double> )task.realize(departments);
        percentOfOpenVacancy.forEach((k,v) -> System.out.printf("%s: percent of open vacancy - %.2f%%\n", k, v));

        System.out.println(DELIMITER);

        task = new OpenVacancyAmountTask7();
        System.out.println("Amount open vacancy in the Company: " + task.realize(departments));

        System.out.println(DELIMITER);

        task = new DepartmentNamesTask8();
        System.out.println(task.realize(departments));

        System.out.println(DELIMITER);

        task = new AmountWomanOfDepartmentTask9();
        Map<String, Long> amountWoman = (Map<String, Long>) task.realize(departments);
        amountWoman.forEach((k,v) -> System.out.printf("Womans in department %s: %d\n", k, v));

        System.out.println(DELIMITER);

        task = new ListEmployeeByNameTask10();
        Map<String, List<Employee>> listEmployeeByName = (Map<String, List<Employee>>)task.realize(departments);
        listEmployeeByName.forEach((k,v) -> { System.out.println(k + ":");
                                                v.forEach(System.out::println);});

        System.out.println(DELIMITER);

        task = new ListEmployeeByAlphabetNameTask11();
        TreeMap<String, List<Employee>> listEmployeeByNameSorted = (TreeMap<String, List<Employee>>)task.realize(departments);
        listEmployeeByNameSorted.forEach((k,v) -> { System.out.println(k + ":");
            v.forEach(System.out::println);});

        System.out.println(DELIMITER);

        task = new AmountEmployeesOlderAgeTask12();
        Map<String, Long> olderAgeByDepart = (Map<String, Long>)task.realize(departments);
        olderAgeByDepart.forEach((k,v) -> System.out.println(k + ", older then 50 years: " + v));

        System.out.println(DELIMITER);

        task = new AverageAgeByCompanyTask13();
        System.out.printf("Average age of company: %.0f years\n", task.realize(departments));

        System.out.println(DELIMITER);
    }
}
