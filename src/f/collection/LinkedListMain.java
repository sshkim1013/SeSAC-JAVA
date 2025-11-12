package f.collection;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);   // [A, B, C]

        list.addFirst("S");
        list.addLast("E");
        System.out.println(list);   // [S, A, B, C, E]

        System.out.println(list.getFirst());    // S

        list.removeFirst();
        System.out.println(list);   // [A, B, C, E]
    }
}
