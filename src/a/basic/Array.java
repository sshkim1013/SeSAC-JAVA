package a.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 선언, 크기지정
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;

        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);


        // 배열 초기화
        // 선언 후 한칸씩 할당
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 선언과 동시에 초기화
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        // 생략
        int[] arr3 = {1, 2, 3, 4, 5};

        String[] names = {"kim", "lee", "park"};

        System.out.println(names.length);


        int[] scores = {80, 40, 80, 90, 100};

        // index 접근
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 요소 반복
        for (int score : scores) {
            System.out.println(score);
        }

        //int[][] matrix = new int[5][5];
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            //System.out.println(i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        // System.out.println(matrix[0][2]);

        int[][] jagged = {
                {1},
                {2, 3,},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        for (int[] row : jagged) {
            for (int item : row) {
                System.out.println(item);
            }
        }


        // ----- 2025.11.05 시작 -----

        // Array 유틸리티 클래스

        int[] nums = {5, 2, 1, 7, 8};

        // 배열의 주소 값이 아닌 내부 내용을 그대로 반환할 수 있다.
        System.out.println(Arrays.toString(nums));  // [5, 2, 1, 7, 8]

        // 오름차순으로 정렬
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // [1, 2, 5, 7, 8]

        // 배열의 데이터가 정렬되어 있어야
        // 이진 탐색을 사용하는 의미가 있다.
        int index = Arrays.binarySearch(nums, 5);
        System.out.println("nums 배열에서 요소 5의 인덱스: " + index + "(번째 인덱스)");    // 2(번째 인덱스)

        int[] filled = new int[10];
        Arrays.fill(filled, 100);
        System.out.println(Arrays.toString(filled));    // [100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        int[] origin = {1, 2, 3, 4, 5};

        // origin 배열을 origin.length 만큼 복사하여 copied 배열의 요소에 삽입
        int[] copied = Arrays.copyOf(origin, origin.length);
        System.out.println(Arrays.toString(copied));    // [1, 2, 3, 4, 5]

        System.out.println("=====");
        System.out.println("[ 사용하면 안되는 예제 ]");
        int[] copied2 = origin;
        System.out.println(Arrays.toString(copied2));
        origin[0] = 100;

        System.out.println("copied 배열: " + Arrays.toString(copied));    // copied 배열: [1, 2, 3, 4, 5]
        System.out.println("origin 배열: " + Arrays.toString(origin));    // origin 배열: [100, 2, 3, 4, 5]
        System.out.println("copied2 배열: " + Arrays.toString(copied2));  // copied2 배열: [100, 2, 3, 4, 5]

        System.out.println("=====");
        System.out.println("[ 원하는 길이만큼 배열을 복사해서 새로운 배열 생성 ]");
        int[] ranged = Arrays.copyOfRange(origin, 1, 3);    // 1번째 인덱스부터 3-1번째 인덱스까지 복사
        System.out.println(Arrays.toString(ranged));

        System.out.println("=====");
        System.out.println("[ 배열 비교 ]");
        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};
        System.out.println("동일성 비교");
        System.out.println(arrA == arrB);   // false
        System.out.println("동등성 비교 - 두 배열의 내부 값 비교");
        System.out.println(Arrays.equals(arrA, arrB));

        System.out.println("=====");
        System.out.println("2차원 이상의 배열의 내용을 출력");
        int[][] mat = { {1, 2}, {3, 4} };
        System.out.println("toString 사용 시 : " + Arrays.toString(mat));   // [[I@7cc355be, [I@6e8cf4c6]
        System.out.println("deepToString 사용 시 : " + Arrays.deepToString(mat));   // [[1, 2], [3, 4]]
    }
}
