package kap.newbie.functional_programming.test.task14collect.model;

/**
 * @author Alexandr Korovkin
 */
public class Employee {
    private String name;
    private boolean isMale;
    private String position;
    private int age;

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
}
