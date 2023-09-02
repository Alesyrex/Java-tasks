package kap.newbie.functional_programming.test.task15withoutstreamapi.var3;

import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Используя классы из практики task14 (model), реализуйте метод,
 * принимающий на вход список сотрудников и возвращающий суммарный возраст обладателей каждого имени.
 * Не используйте Map.merge().
 *
 * @author Alexandr Korovkin
 */
public class SumAgeByName {
    public static Map<String, Integer> getSumAge(List<Employee> employees) {
        var sumAgeByName = new HashMap<String, Integer>();

        employees.forEach(e -> {
            sumAgeByName.compute(e.getName(), (k, v) -> v == null ? e.getAge() : v + e.getAge());
        });

        return sumAgeByName;
    }
}
