package kap.newbie.iostreams.test.task5in.model;

/**
 * @author Alexandr Korovkin
 */
public class Car {
    private String model;
    private String series;
    private Color color;
    private String number;
    private int issueYear;

    public Car(String model, String series, String color, String number, int issueYear) {
        this.model = model;
        this.series = series;
        this.color = Color.getColor(color);
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
                ", color=" + color.getColour() +
                ", number='" + number + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setColor(String color) {
        this.color = Color.getColor(color);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }
}
