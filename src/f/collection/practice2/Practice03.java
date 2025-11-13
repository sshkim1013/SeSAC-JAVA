package f.collection.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice03 {

    public static void main(String[] args) {
        // 테스트 1
        String str1 = "hello";
        Map<Character, List<Integer>> result1 = findCharacterPositions(str1);
        System.out.println("테스트 1: " + result1);
        // {h=[0], e=[1], l=[2, 3], o=[4]}

        // 테스트 2
        String str2 = "programming";
        Map<Character, List<Integer>> result2 = findCharacterPositions(str2);
        System.out.println("테스트 2: " + result2);

        // 테스트 3: 모두 같은 문자
        String str3 = "aaa";
        Map<Character, List<Integer>> result3 = findCharacterPositions(str3);
        System.out.println("테스트 3: " + result3);
        // {a=[0, 1, 2]}

        // 테스트 4: 빈 문자열
        String str4 = "";
        Map<Character, List<Integer>> result4 = findCharacterPositions(str4);
        System.out.println("테스트 4: " + result4);
        // {}
    }

    // 여기에 메서드 구현
    public static Map<Character, List<Integer>> findCharacterPositions(String str) {

        // 빈 문자열이면 빈 Map 반환
        if (str.isEmpty()) {
            return new HashMap<>();
        }

        Map<Character, List<Integer>> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 아래의 두 코드 중 하나만 사용

            // putIfAbsent() 메서드 사용
            result.putIfAbsent(ch, new ArrayList<>());
            result.get(ch).add(i);

            // containsKey() 메서드 사용
            if (!result.containsKey(ch)) {
                result.put(ch, new ArrayList<>());
            }
            result.get(ch).add(i);
        }

        return result;
    }
}
