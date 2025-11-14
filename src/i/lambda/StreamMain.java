package i.lambda;

import java.util.Arrays;
import java.util.List;
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
    }
}
