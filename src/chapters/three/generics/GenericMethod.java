package chapters.three.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <T, U> Cell<T, U> apply(T t, U u) {
        return new Cell<T, U>(t, u);
    }

    public <T> Integer result(T t) {
        return 10;
    }

    public <T> T getType(T t) {
        return t;
    }

    public static <T> void doSmth(T t) {

    }

    public static void main(String[] args) {
        GenericMethod.<String>doSmth("hello world");
        List<Integer> a = new ArrayList<>();
        List list = new ArrayList();
        a = list;
    }

}
