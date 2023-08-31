package kap.newbie.functional_programming.test.task14collect.model;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Department {
    private String name;
    private List<Employee> employees;
    private int vacancyAmount;

    public Department(String name, int vacancyAmount, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
        this.vacancyAmount = vacancyAmount;
    }

    public Department(String name, int vacancyAmount) {
        this.name = name;
        this.vacancyAmount = vacancyAmount;
    }

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
