package chapters.three.bounds.test;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    public static void main(String[] args) {
        List<? super Integer> superList = new ArrayList<Number>();
        List<? extends Integer> extendingList = new ArrayList<>();

        superList.add(1);
        Object object = superList.get(0); //can get only Object type

//        extendingList.add(1); compile error, cannot add anything to <? extends> list
        Integer integer = extendingList.get(0); //can get low bound type (Integer), 'cause it's parent

        List objects = new ArrayList();
        objects = superList; // OK
        superList = objects; // Unchecked assignment
        objects.add(new Object()); // Unchecked call
    }

}
