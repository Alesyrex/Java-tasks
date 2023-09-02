package kap.newbie.functional_programming.test.task15withoutstreamapi;

import kap.newbie.functional_programming.test.task14collect.model.Employee;
import kap.newbie.functional_programming.test.task14collect.service.CreateListDepartment;
import kap.newbie.functional_programming.test.task15withoutstreamapi.var1.OlderByNameEmployee;
import kap.newbie.functional_programming.test.task15withoutstreamapi.var2.AllEmployeeListByName;
import kap.newbie.functional_programming.test.task15withoutstreamapi.var3.SumAgeByName;

import java.util.List;
import java.util.Map;

/**
 * @author Alexandr Korovkin
 */
public class SimpleHRM {
    public static final String DELIMITER = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    public static void main(String[] args) {
        List<Employee> employees = CreateListDepartment.getAllEmployeesList();

        var olderByName = OlderByNameEmployee.getOlderEmployee(employees);
        olderByName.forEach((k,v) -> System.out.println(k + ":\n" + v));

        System.out.println(DELIMITER);

        var allEmployeesByName = AllEmployeeListByName.getAllEmployeeByName(employees);
        allEmployeesByName.forEach((k,v) -> {
            System.out.println(k + ":");
            v.forEach(System.out::println);
        });

        System.out.println(DELIMITER);

        var sumAgeByName = SumAgeByName.getSumAge(employees);
        sumAgeByName.forEach((k, v) -> System.out.println(k + ": sum age - " + v + " years"));

        System.out.println(DELIMITER);
    }
}
