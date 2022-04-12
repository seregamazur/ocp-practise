package chapters.three.bounds.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<? extends B> b = new ArrayList<>();


        List<? super Dispatcher> dispatcher = new ArrayList<Object>();
        dispatcher.add(new Dispatcher());
    }

}
