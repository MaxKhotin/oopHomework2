package Task1;

public class Car {
    private int productionYear;
    private String color;

    public Car() {
        this.productionYear = 0000;
        this.color = "Not stated";
    }

    public Car (int year) {
        this.productionYear = year;
        this.color = "Not stated";
    }

    public Car (int year, String color){
        this.productionYear = year;
        this.color = color;
    }

    public void getInfo() {
        System.out.println("Год выпуска: " + productionYear + " Цвет: " + color);
    }
}
