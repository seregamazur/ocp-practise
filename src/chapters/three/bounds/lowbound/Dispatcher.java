package chapters.three.bounds.lowbound;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    public static void main(String[] args) {
//        List<? super Flyer> superFlyers = new ArrayList<>(); -> nothing can be added here

        List<Integer> strings = new ArrayList<>();
        strings.add(1);
        List<Object> objects = new ArrayList<>(strings);
        List<Number> numbers = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
        addSound(numbers);
    }

    static void addSound(List<? super Integer> list) {
    }

}
