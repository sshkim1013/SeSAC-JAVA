package g.javaclass;

import java.util.Arrays;

public class StringMain {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);   // true
        System.out.println(str1.equals(str2));   // true

        // 두 객체는 주소가 다르다.
        // == 비교는 false
        // equals 비교는 true
        String str3 = new String("Hi");
        String str4 = new String("Hi");
        System.out.println(str3 == str4);   // false
        System.out.println(str3.equals(str4));   // true

        String str5 = "hello";
        System.out.println(str1.equals(str5));  // false
        System.out.println(str1.equalsIgnoreCase(str5));  // true

        System.out.println(str1.length());  // 5
        System.out.println(str1.charAt(2)); // l

        System.out.println(str1.indexOf("e"));  // 1
        System.out.println(str1.lastIndexOf("l"));  // 3

        // 2번 인덱스 이상 ~ 4번 인덱스 미만
        System.out.println(str1.substring(2, 4));   // ll

        System.out.println(str1.contains("h")); // false
        System.out.println(str1.contains("H")); // true

        System.out.println(str1.startsWith("h"));   // false
        System.out.println(str1.endsWith("o")); // true

        System.out.println();

        System.out.println("===== 공백 제거 =====");

        String str6 = "     Hello   ";
        System.out.println(str6.trim());    // 양쪽 공백 제거
        System.out.println(str6.strip());

        // 글자 대체
        System.out.println(str6.replace("He", "Hi"));

        String csv = "apple, banana, orange";
        String[] fruits = csv.split(", ");
        System.out.println(Arrays.toString(fruits));    // [apple, banana, orange]

        System.out.println();

        System.out.println("===== StringBuilder =====");
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(5);
        sb.append(10);
        System.out.println(sb.toString());  // 1510
    }
}
