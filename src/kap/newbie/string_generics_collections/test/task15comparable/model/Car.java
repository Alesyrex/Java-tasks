package kap.newbie.string_generics_collections.test.task15comparable.model;

import java.util.Comparator;

/**
 * @author Alexandr Korovkin
 */
public class Car implements Comparable<Car>{
    //    Уникальным идентификатором будет объект immutable класса CarIdentifier
    private final CarIdentifier identifier;

    private String color;
    private boolean actualTechnicalInspection;

    public Car(String number, int year, String color, boolean actualTechnicalInspection) {
        this(new CarIdentifier(number, year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifier identifier, String color, boolean actualTechnicalInspection) {
        this.identifier = identifier;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
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
