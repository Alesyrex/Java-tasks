package kap.newbie.functional_programming.test.task9stream.var1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Задача состоит в том, чтобы сгруппировать массив записей о сотрудниках в карту данных, организованную по должностям.
 *
 * @author Alexandr Korovkin
 */
public class JobTitle {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("worker"), new Employee("notworker"), new Employee());

        Map<String, List<Employee>> map = groupByJobTitleWithStream(list);

        for(Map.Entry<String, List<Employee>> emp : map.entrySet()) {
            System.out.println(emp.getKey());
            emp.getValue().forEach(System.out::println);
        }
    }

    public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }

    public static Map<String, List<Employee>> groupByJobTitleWithStream(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }
}
