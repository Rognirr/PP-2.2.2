package web.model;

public class Car {

    private String brand;
    private int series;
    private String type;

    public Car() {
    }

    public Car(String brand, int series, String type) {
        this.brand = brand;
        this.series = series;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", type='" + type + '\'' +
                '}';
    }
}
