package chapters.three.generics;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    public static void main(String[] args) {
        Car car = new Car(1_000);
        Cell<Car, Integer> cell = new Cell<>(car, car.getWeight());
        List<Car> carList = new ArrayList<>();
        fillCarList(carList);
        Car car1 = (Car) carList.get(0);
//        carList.get(0).getWeight(); class cast exception
//        carList.get(0); Class cast exception

        List<? super IOException> list = new ArrayList<>();
//        list.add(new Exception()); //compile error
//        list.add(new Object()); //compile error

        List<? super Dispatcher> list1 = new ArrayList<>();
        list1.add(new Dispatcher());

        List<Object> objects = new ArrayList<>();
        objects.add("");
        objects.add(1);
        objects.add(new Dispatcher());
    }
    static void fillCarList(List carList) {
        carList.add(new SomeClazz());
    }


}
