package chapters.three.bounds.upperbound;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    public static void main(String[] args) {
        List<Flyer> flyers = new ArrayList<>();
        flyers.add(new Bird()); //ok
        flyers.add(new Superman()); //ok

        /// Cannot add particular child to such list
        List<? extends Flyer> extendsFlyer = new ArrayList<>(); // -> nothing can be added here
//        extendsFlyer.add(new Bird()); //compile error should have particular type
//        extendsFlyer.add(new Superman()); //compile error should have particular type

        ///
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird());
        addSmth(birds);
    }

    //   Cannot add particular child to such list
//    static void addSmth(List<? extends Flyer> list) {
//        list.add(new Bird()); // compile error should have particular type
//    }

    static void addSmth(List<? extends Flyer> list) {
        list.forEach(System.out::println);
    }

}
