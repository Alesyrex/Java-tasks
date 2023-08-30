package kap.newbie.functional_programming.test.task14collect.model;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Department {
    private String name;
    private List<Employee> employees;
    private int vacancyAmount;

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getVacancyAmount() {
        return vacancyAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setVacancyAmount(int vacancyAmount) {
        this.vacancyAmount = vacancyAmount;
    }
}
