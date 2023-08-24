package kap.newbie.functional_programming.test.task9stream.var1;

public class Employee {
    private final String title;
    private int salary;

    public Employee(){
        this("employee", 1500);
    }

    public Employee(String title){
        this(title, 1500);
    }

    public Employee(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
