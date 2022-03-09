package chapters.one.instanceofsmth;

public class Dispatcher {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Car realCar = new Car();
        Vehicle bicycle = new Bicycle();
        Bicycle realBicycle = new Bicycle();

        System.out.println(car instanceof Vehicle); //true
        System.out.println(bicycle instanceof Vehicle); //true
        System.out.println(car instanceof Bicycle); //false
        System.out.println(car instanceof Cloneable); //false
        System.out.println(car instanceof Seriohable); //true

        System.out.println(realCar instanceof Vehicle); //true
        System.out.println(realCar instanceof Car); //true
        System.out.println(vehicle instanceof Car); //false
        // System.out.println(realCar instanceof Bicycle); compile error
        System.out.println(realBicycle instanceof Seriohable); //true
    }

}
