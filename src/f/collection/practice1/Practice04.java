package f.collection.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice04 {

    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 3, 2, 1, 3, 1)
        );
        System.out.println("입력: " + list1);
        System.out.println("출력: " + countFrequency(list1));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(5, 5, 5, 5, 5)
        );
        System.out.println("\n입력: " + list2);
        System.out.println("출력: " + countFrequency(list2));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        System.out.println("\n입력: " + list3);
        System.out.println("출력: " + countFrequency(list3));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("\n입력: " + list4);
        System.out.println("출력: " + countFrequency(list4));
    }

    public static ArrayList<ArrayList<Integer>> countFrequency(ArrayList<Integer> list) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (Integer num : list) {

            boolean found = false;

            for (ArrayList<Integer> pair : result) {
                if (pair.get(0).equals(num)) {
                    pair.set(1, pair.get(1) + 1);
                    found = true;
                    break;
                }
            }

            if (!found) {
                ArrayList<Integer> newPair = new ArrayList<>();
                newPair.add(num);
                newPair.add(1);
                result.add(newPair)
;            }
        }

        return result;
    }
}
