package i.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // System.out.println(list);   // [1, 2, 3, 4, 5]

        int sum = 0;
        for (Integer item : list) {
            if (item % 2 == 0) {
                sum += item * item;
            }
        }
        System.out.println(sum);

        int sum2 = list.stream()
                .filter(num -> num % 2 == 0)    // 짝수만 필터링 - 지연 연산
                .map(a -> a * a)                // 값 변경 수행(제곱) - 지연 연산
                .reduce(0, Integer::sum);      // 누적 합계 연산 - 최종 연산
        System.out.println(sum2);   // 20

        System.out.println("===== 스트림 방식 두 가지 =====");

        List<String> nameList = Arrays.asList("Kim", "Lim");
        Stream<String> nameStream = nameList.stream();
        System.out.println(nameStream);     // java.util.stream.ReferencePipeline$Head@b4c966a

        String[] nameArray = {"A", "B", "C"};
        Stream<String> nameStream2 = Arrays.stream(nameArray);
        System.out.println(nameStream2);    // java.util.stream.ReferencePipeline$Head@2f4d3709

        System.out.println("\n===== filter() =====");

        List<Integer> numbers = Arrays.asList(5, 4, 1, 7, 8, 3, 2, 9, 5);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());  // .toList(); 로 대체 가능!
        System.out.println(evens);  // [4, 8, 2]

        List<Integer> greaterThan5 = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(greaterThan5);   // [7, 8, 9]

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 5)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);   // [8]

        List<String> words = Arrays.asList("Apple", "Banaba", "Cherry");
        List<String> longWords = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(longWords);  // [Banaba, Cherry]


        System.out.println("\n===== map() =====");
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);    // [25, 16, 1, 49, 64, 9, 4, 81, 25]

        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);  // [APPLE, BANABA, CHERRY]


        System.out.println("\n===== sorted() =====");
        // 순서대로 정렬
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);     // [1, 2, 3, 4, 5, 5, 7, 8, 9]

        List<Integer> reversed = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reversed);     // [9, 8, 7, 5, 5, 4, 3, 2, 1]


        System.out.println("\n===== distinct() =====");
        List<Integer> unique = numbers.stream()
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(unique);     // [9, 8, 7, 5, 4, 3, 2, 1]

        System.out.println("\n===== forEach() =====");
        numbers.stream().forEach(System.out::print);    // 541783295

        System.out.println();

        numbers.stream()
                .filter(n -> n > 5)
                .forEach(n -> System.out.print(n + " "));    // 7 8 9

        System.out.println();

        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(
                        s -> s, // key
                        String::length  // value
                ));
        System.out.println(map);    // {Apple=5, Cherry=6, Banaba=6}

        System.out.println("\n===== reduce() =====");
        Integer result = numbers.stream()
                .reduce(1, (a, b) -> a * b);    // 1부터 시작하는 누적 곱
        System.out.println(result); // 302400

        System.out.println("\n===== count() =====");
        long count = numbers.stream().count();
        System.out.println(count);  // 9
    }
}
