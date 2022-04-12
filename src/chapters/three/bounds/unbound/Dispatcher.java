package chapters.three.bounds.unbound;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("");

        List<Object> objects = new ArrayList<>();
        objects.add(1);
        show(strings);
        show(objects);
    }

    public static void show(List<?> elements) {
        elements.forEach(System.out::println);
    }

//    public static void show(List<Object> elements) {
//        elements.forEach(System.out::println);            -> compile error, cannot set list<string> to list<object>
//    }

}
