package kap.newbie.oop.test.task16.model;

/**
 * @author Alexandr Korovkin
 */
public class Car {
    private final Company company;
    private final Color color;
    private final String number;

    public Car(Company company, Color color, String number){
        this.company = company;
        this.color = color;
        this.number = number;
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().equals((obj.getClass()))){
            return false;
        }
        Car car = (Car)obj;

        return this.company.equals(car.company) && this.color.equals(car.color)
                && this.number.equals(car.number);
    }

    @Override
    public String toString() {
        return "Car{" + company.toString() + ", color=" + color + ", number='" + number + '\'' + '}';
    }
}
