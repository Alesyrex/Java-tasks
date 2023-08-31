package kap.newbie.functional_programming.test.task14collect.model;

/**
 * @author Alexandr Korovkin
 */
public class Employee {
    private String name;
    private boolean isMale;
    private String position;
    private int age;

    public Employee(String name, int age, boolean isMale, String position) {
        this.name = name;
        this.isMale = isMale;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
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
