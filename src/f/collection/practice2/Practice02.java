package f.collection.practice2;

import java.util.HashMap;
import java.util.Map;

public class Practice02 {

    public static void main(String[] args) {
        // 테스트 1
        String[] words1 = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        Map<String, Integer> result1 = countWordFrequency(words1);
        System.out.println("테스트 1: " + result1);
        // {apple=3, banana=2, cherry=1}

        // 테스트 2
        String[] words2 = {"hello", "world"};
        Map<String, Integer> result2 = countWordFrequency(words2);
        System.out.println("테스트 2: " + result2);
        // {hello=1, world=1}

        // 테스트 3: 빈 배열
        String[] words3 = {};
        Map<String, Integer> result3 = countWordFrequency(words3);
        System.out.println("테스트 3: " + result3);
        // {}

        // 테스트 4: 모두 같은 단어
        String[] words4 = {"test", "test", "test"};
        Map<String, Integer> result4 = countWordFrequency(words4);
        System.out.println("테스트 4: " + result4);
        // {test=3}
    }

    // 여기에 메서드 구현
    public static Map<String, Integer> countWordFrequency(String[] words) {

        // 빈 배열이면 빈 Map 반환
        if (words.length == 0) {
            return new HashMap<>();
        }

        HashMap<String, Integer> result = new HashMap<>();

        // 아래 두 코드 중 하나만 사용

        // 1. putIfAbsent() 메서드 사용
        for (String word : words) {
            result.putIfAbsent(word, 0);
            result.put(word, result.get(word) + 1);
        }

        // 2. getOrDefault() 메서드 사용
        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        return result;
    }
}
