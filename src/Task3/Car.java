package Task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 0;
        this.speed = 0;
        this.weight = 0;
        this.color = "Not stated";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 0;
        this.weight = 0;
        this.color = "Not stated";
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
        this.weight = 0;
        this.color = "Not stated";
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
        this.color = "Not stated";
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    void getInfo() {
        System.out.println("Год выпуска: " + year + " Скорость: " + speed + " Вес: " + weight + " Цвет: " + color);
    }
}