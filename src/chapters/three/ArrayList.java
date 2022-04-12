package chapters.three;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        String[] lines = new String[]{"hello", "world"};
        List<String> list = Arrays.asList(lines);
        System.out.println(list.get(0));
        //list.remove(1); unsupported operation exception

        int[] numbers = new int[]{1, 2, 3};
//        List<Integer> list1 = Arrays.asList(numbers);  compile error, no cast
        List<Integer> integers = new java.util.ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.remove(5L);
        System.out.println(integers);
    }
}
