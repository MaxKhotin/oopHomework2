package Task3;
//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//        Перегрузить конструкторы вызывая конструктор из конструктора.
//        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами
public class Main {
    public static void main(String[] args) {
        Car opel = new Car();
        Car audi = new Car(2016);
        Car bmw = new Car(2020,260);
        Car volkswagen = new Car (2010,160,1900);
        Car mercedes = new Car (1999,200,2500,"Серый");
        opel.getInfo();
        audi.getInfo();
        bmw.getInfo();
        volkswagen.getInfo();
        mercedes.getInfo();
    }
}
