package Task2;
//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//        Перегрузить конструкторы.
//        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Main {
    public static void main(String[] args) {
        Car gm = new Car();
        Car crysler = new Car(2015);
        Car chevrolet = new Car(1995, 215);
        Car dodge = new Car(1980, 180, 2000);
        Car lincoln = new Car(2017, 240, 2800, "Чёрный");
        gm.getInfo();
        crysler.getInfo();
        chevrolet.getInfo();
        dodge.getInfo();
        lincoln.getInfo();
    }
}