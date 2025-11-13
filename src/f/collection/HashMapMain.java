package f.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapMain {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 1000);
        map.put("Banana", 2000);
        map.put("Cherry", 1000);
        System.out.println(map);    // {Apple=1000, Cherry=1000, Banana=2000}

        // map.get(키);
        int price = map.get("Apple");
        System.out.println(price);  // 1000

        // 키 존재 여부
        System.out.println(map.containsKey("Apple"));   // true
        System.out.println(map.containsKey("Melon"));   // false

        System.out.println(map.containsValue(2000));    // true
        System.out.println(map.containsValue(5000));    // false

        map.put("Apple", 5000);
        System.out.println(map);    // {Apple=5000, Cherry=1000, Banana=2000}

        map.remove("Banana");
        System.out.println(map.size()); // 2
        System.out.println(map.isEmpty());  // false

        // map.clear();
        // System.out.println(map.isEmpty());  // true

        System.out.println(map.get("Durian"));  // null

        // Durian 이라는 키가 존재하지 않으면 0을 반환
        System.out.println(map.getOrDefault("Durian", 0));  // 0

        if (map.containsKey("Durian")) {
            System.out.println(map.get("Durian"));
        }

        // Durian 이라는 키의 값이 존재하지 않으면
        // 100이라는 값을 가지고 있는 Durian 삽입
        // 만약 존재하면 건너 뛴다.
        map.putIfAbsent("Durian", 100);
        map.putIfAbsent("Apple", 100);
        System.out.println(map);    // {Apple=5000, Cherry=1000, Durian=100}


        System.out.println("===== 반복문 =====");

        System.out.println(map.keySet());   // [Apple, Cherry, Durian]
        for (String key : map.keySet()) {
            System.out.print(key + ": " + map.get(key) + " ");   // Apple: 5000 Cherry: 1000 Durian: 100
        }

        System.out.println();

        for (Integer value : map.values()) {
            System.out.print(value + " ");  // 5000 1000 100
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");   // Apple: 5000 Cherry: 1000 Durian: 100
        }

        System.out.println();

        System.out.println("===== TreeMap 예제 =====");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Banana", 1500);
        treeMap.put("Apple", 1000);
        treeMap.put("Cherry", 2000);
        treeMap.put("Durian", 2500);

        // 키 기준 오름차순
        // {Apple=1000, Banana=1500, Cherry=2000, Durian=2500}
        System.out.println(treeMap);
    }
}
