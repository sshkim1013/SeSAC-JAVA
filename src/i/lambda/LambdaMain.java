package i.lambda;

import java.util.Comparator;
import java.util.function.*;

// 함수형 인터페이스로 정의
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaMain {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        };

        Comparator<Integer> comparator2 = (a, b) -> Integer.compare(a, b);

        // 매개변수 없는 형태
        // 단순 실행
        Runnable task = () -> System.out.println("실행");
        task.run(); // 실행

        // 매개변수가 1개
        // 반환을 하지 않고 출력할 때 사용!
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("Hi"); // Hi

        // 매개변수를 2개 받아 1개의 결과를 반환
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1, 2));    // 3

        // 람다식 구현 구문이 여러 줄이면 {} (중괄호)가 필요하다!
        BiFunction<Integer, Integer, Integer> calculate = (a, b) -> {
            int sum = a + b;
            return sum / 2;
        };
        System.out.println(calculate.apply(5, 10));     // 7

        Calculator cal = (a, b) -> a + b;
        System.out.println(cal.calculate(1, 2));    // 3

        Calculator cal2 = (a, b) -> a * b;
        System.out.println(cal2.calculate(10, 20)); // 200

        System.out.println("===== 표준 함수형 인터페이스 =====");

        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println(supplier.get());     // Hello, World!


        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello");   // Hello

        // 값을 받아서 다른 값 반환
        Function<String, Integer> function = (str) -> str.length();
        System.out.println(function.apply("Hello"));    // 5

        System.out.println("===== 메서드 참조 =====");
        // 메서드 참조 (::)
        // 아래 두 코드는 같은 결과
        Function<String, Integer> parser1 = (str) -> Integer.parseInt(str);
        Function<String, Integer> parser2 = Integer::parseInt;

        System.out.println(parser1.apply("123"));   // 123(숫자)
        System.out.println(parser2.apply("123"));   // 123(숫자)

        String prefix = "Hello, ";
        Function<String, String> greeter1 = name -> prefix.concat(name);
        Function<String, String> greeter2 = prefix::concat;

        System.out.println(greeter1.apply("World!"));   // Hello, World!
        System.out.println(greeter2.apply("World!"));   // Hello, World!
    }
}
