package f.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // 순서 보장 X
        System.out.println(set);    // [Apple, Cherry, Banana]

        // 중복 허용 X
        set.add("Apple");
        System.out.println(set);    // [Apple, Cherry, Banana]

        System.out.println(set.contains("Banana")); // true
        System.out.println(set.contains("Melon")); // false

        set.remove("Apple");
        System.out.println(set);    // [Cherry, Banana]

        System.out.println(set.size()); // 2
        System.out.println(set.isEmpty());   // false

        // set.clear();
        // System.out.println(set.isEmpty());  // true

        // for 반복문 적용 가능
        for (String item : set) {
            System.out.print(item + " ");   // Cherry Banana
        }

        System.out.println();

        Set<Integer> intSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> intSet2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // A.addAll(B) : A와 B의 합집합
        // intSet1.addAll(intSet2);
        // System.out.println(intSet1);    // [1, 2, 3, 4, 5, 6, 7, 8]

        // A.retainAll(B) : A와 B의 교집합
        // intSet1.retainAll(intSet2);
        // System.out.println(intSet1);    // [4, 5]

        // A.removeAll(B) : A와 B의 차집합
        intSet1.removeAll(intSet2);
        System.out.println(intSet1);    // [1, 2, 3]

        // A.containsAll(B) : A가 B의 부분 집합인가?
        boolean result = intSet1.containsAll(intSet2);
        System.out.println(result); // false

    }
}
