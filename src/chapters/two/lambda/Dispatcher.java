package chapters.two.lambda;

public class Dispatcher {

    public static void main(String[] args) {
        Car car = new Car(900);
        print(car, (Car c) -> {return c.horsePower > 10;});
    }

    private static void print(Car car, FastCar fastCar) {
        if (fastCar.test(car)) {
            System.out.println("Car is fast");
        }
    }
}
