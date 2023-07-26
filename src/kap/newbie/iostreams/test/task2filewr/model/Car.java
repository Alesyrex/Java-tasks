package kap.newbie.iostreams.test.task2filewr.model;

/**
 * @author Alexandr Korovkin
 */
public class Car {
    private final String model;
    private final String series;
    private final Color color;
    private final String number;
    private final int issueYear;

    public Car(String model, String series, Color color, String number, int issueYear) {
        this.model = model;
        this.series = series;
        this.color = color;
        this.number = number;
        this.issueYear = issueYear;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + issueYear;
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
        if (!getClass().equals((obj.getClass()))) {
            return false;
        }
        Car car = (Car) obj;

        return this.model.equals(car.model) && this.series.equals(car.series) && this.color.equals(car.color)
                && this.number.equals(car.number) && this.issueYear == car.issueYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", color=" + color +
                ", number='" + number + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }
}
