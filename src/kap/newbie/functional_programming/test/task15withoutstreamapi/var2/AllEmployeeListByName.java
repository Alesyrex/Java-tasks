package kap.newbie.functional_programming.test.task15withoutstreamapi.var2;

import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Используя классы из практики task14 (model), реализуйте метод,
 * принимающий на вход список сотрудников и возвращающий список обладателей каждого имени.
 *
 * @author Alexandr Korovkin
 */
public class AllEmployeeListByName {
    public static Map<String, List<Employee>> getAllEmployeeByName(List<Employee> employees) {
        var allEmployeeByName = new HashMap<String, List<Employee>>();

        employees.forEach(e ->
            allEmployeeByName.computeIfAbsent(e.getName(), k -> new ArrayList<>()).add(e));

        return allEmployeeByName;
    }
}
