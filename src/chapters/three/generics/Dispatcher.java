package chapters.three.generics;

public class Dispatcher {

    public static void main(String[] args) {
        Car car = new Car(1_000);
        Cell<Car, Integer> cell = new Cell<>(car, car.getWeight());
    }
}
