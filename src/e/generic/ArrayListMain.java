package e.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("orange");
        System.out.println(list);   // [apple, orange]

        // 원하는 index에 요소 삽입
        list.add(1, "cherry");
        System.out.println(list);   // [apple, cherry, orange]

        String element = list.get(1);
        System.out.println(element);    // cherry

        list.set(2, "grape");
        System.out.println(list);   // [apple, cherry, grape]

        list.remove(0);     // apple 삭제
        list.remove("grape");   // grape 삭제
        System.out.println(list);   // [cherry]

        System.out.println(list.size());    // 1
        System.out.println(list.isEmpty()); // false

        // -------------------------------------------------

        ArrayList<Integer> intList = new ArrayList<>();

        intList.addAll(Arrays.asList(5, 9, 3, 10, 9, 11));
        System.out.println(intList);    // [5, 9, 3, 10]

        int index = intList.indexOf(9); // 첫 번째로 만나는 9의 인덱스를 반환
        System.out.println(index);  // 1

        int lastIndex = intList.lastIndexOf(9); // 마지막으로 나오는 9의 인덱스 반환
        System.out.println(lastIndex);  // 4

        List<Integer> subList = intList.subList(0, 3);  // 0번째 인덱스부터 3-1번째 인덱스까지
        System.out.println(subList);    // [5, 9, 3]

        // intList.clear();
        // System.out.println(intList);    // []

        // new Integer[0] : “나는 Integer 타입 배열을 원해. 크기는 모르겠으니 알아서 새로 만들어줘!"
        Integer[] array = intList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        // -------------------------------------------------

        System.out.println("for-each");
        for (Integer num : intList) {
            System.out.print(num + " ");    // 5 9 3 10 9 11
        }

        System.out.println("\nindex-for");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i)+ " ");  // 5 9 3 10 9 11
        }

        System.out.println("\niterator");
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");    // 5 9 3 10 9 11
        }
    }
}
