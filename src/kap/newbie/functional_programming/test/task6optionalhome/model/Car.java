package kap.newbie.functional_programming.test.task6optionalhome.model;

import java.util.Comparator;

/**
 * @author Alexandr Korovkin
 */
public class Car implements Comparable<Car>{
    //    Уникальным идентификатором будет объект immutable класса CarIdentifier
    private final CarIdentifier identifier;
    private Human owner;
    private String color;
    private boolean actualTechnicalInspection;

    public Car(String number, int year, String color, Human owner, boolean actualTechnicalInspection) {
        this(new CarIdentifier(number, year), color, owner, actualTechnicalInspection);
    }

    public Car(CarIdentifier identifier, String color, Human owner, boolean actualTechnicalInspection) {
        this.identifier = identifier;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
        this.owner = owner;
    }

    public CarIdentifier getIdentifier() {
        return identifier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActualTechnicalInspection() {
        return actualTechnicalInspection;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public int compareTo(Car o) {
        Comparator<CarIdentifier> comp = Comparator.comparing(CarIdentifier::getNumber)
                                            .thenComparing(CarIdentifier::getYear);
        return comp.compare(this.identifier, o.identifier);
    }

    @Override
    public String toString() {
        return "Car{" +
                ", technical inspection='" + actualTechnicalInspection + '\'' +
                ", color=" + color +
                ", number='" + identifier.getNumber() + '\'' +
                ", issueYear=" + identifier.getYear() +
                '}';
    }
}
