package c.oop2;

import java.util.Arrays;

class Sample {
    int value;
}

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 배열 형태의 매개변수로 받기
    int add(int ... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // 반환 값이 없는 경우
    void printResult(int result) {
        System.out.println(result);
    }

    // String 반환
    String printValue(int score) {
        if (score >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }

    // 배열 반환
    int[] getArray() {
        return new int[]{1, 3, 5, 7, 9};
    }

    // 객체 반환
    Sample getSample() {
        return new Sample();
    }
}
