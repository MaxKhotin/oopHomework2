package Task1;

//Создать класс Машина с полями год(int), цвет(String).
//        Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//        Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        Car mercedes = new Car(1981);
        Car tesla = new Car(2021, "Красный");
        ford.getInfo();
        mercedes.getInfo();
        tesla.getInfo();
    }
}
