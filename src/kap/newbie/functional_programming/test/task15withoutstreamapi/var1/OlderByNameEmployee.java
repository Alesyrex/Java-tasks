package kap.newbie.functional_programming.test.task15withoutstreamapi.var1;



import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Используя классы из практики task14 (model), реализуйте метод,
 * принимающий на вход список сотрудников и возвращающий самого старшего обладателя каждого имени.
 *
 * @author Alexandr Korovkin
 */
public class OlderByNameEmployee {
    public static Map<String, Employee> getOlderEmployee(List<Employee> employees){
        Map<String, Employee> olderByName = new HashMap<>();

        employees.forEach(e ->
                olderByName.merge(e.getName(), e, (oldE, newE) -> newE.getAge() > oldE.getAge() ? newE : oldE));

        return olderByName;
    }
}
