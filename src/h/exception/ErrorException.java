package h.exception;

import java.io.*;

public class ErrorException {

    public static void main(String[] args) throws IOException {
//         recursiveMethod();
//
//         Exception
//         int result = 10 / 0;

//        String str = null;
//         System.out.println(str.length());

//        int[] arr = {1, 2, 3};
//        System.out.println(arr[99]);

//        int num = Integer.parseInt("123");  // 가능
//        int num = Integer.parseInt("Hello");  // 불가능

//        try {
//            int result = 1 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        }
//
//        System.out.println("next");

//        FileReader fr = null;
//        try {
//            fr = new FileReader("data.txt");
//            System.out.println("파일을 불러왔습니다.");
//        } catch (IOException e) {
//            System.out.println("파일이 존재하지 않습니다.");
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException e) {
//                System.out.println("FileReader close 실패!");
//            }
//        }

        try {
            String input = "123";
            int num = Integer.parseInt(input);
            int result = 100 / num;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("모르는 예외");
        }

        try {
            method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//         try {
//             FileReader fr = new FileReader("a.txt");
//         } catch (FileNotFoundException e) {
//             throw new RuntimeException(e);
//         }
//
//         try {
//             int result = 10 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         }
    }

    static void method() throws IOException {
        FileReader fr = new FileReader("test");
    }

//    static void recursiveMethod() {
//        recursiveMethod();
//    }
}
