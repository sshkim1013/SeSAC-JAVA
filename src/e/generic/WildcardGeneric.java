package e.generic;

import java.util.*;

public class WildcardGeneric {

    public static void printList(List<?> array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] intList = {1, 2, 3};
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0);
        List<String> stringList = Arrays.asList("A", "B", "C");

        printList(intList);
        printList(doubleList);
        printList(stringList);

        // intList.add(4);
        // intList.add(5);

        List<? extends Number> list = intList;
        list.get(0);    // <- 읽기 가능
        // list.add(1); <- 쓰기 제한

        List<Number> numberList = new ArrayList<>();
        List<? super Integer> list2 = numberList;
        list2.add(1);   // <- 쓰기 가능
        // list2.get(0); <- 읽기 제한
    }

    // ClassName<Integer extends Number>
    // ClassName<? extends Number>
    // ClassName<T extends Number>
}
