package kap.newbie.functional_programming.test.task6optionalhome.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Human {
    private final String firstName;
    private Human mother;

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    private Human father;
    private final List<Human> kids;
    private Housing home;
    private String occupation;
    private Car car;

    public Human(String firstName){
        this(firstName, null, null, new ArrayList<>(),
                new Housing("Park avenue"), "doctor", null);
    }

    public Human(String firstName, Housing home, String occupation, Car car){
        this(firstName, null, null, new ArrayList<>(),
                home, occupation, car);
    }

    public Human(String firstName, Human mother, Human father,
                 List<Human> kids, Housing home, String occupation, Car car) {
        this.firstName = firstName;
        this.mother = mother;
        this.father = father;
        this.kids = kids;
        this.home = home;
        this.occupation = occupation;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getKids() {
        return kids;
    }

    public Housing getHome() {
        return home;
    }

    public String getOccupation() {
        return occupation;
    }

    public Car getCar() {
        return car;
    }

    public void setHome(Housing home) {
        this.home = home;
    }

    public boolean addKid(Human kid){
        return kids.add(kid);
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
