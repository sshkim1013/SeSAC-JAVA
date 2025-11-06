package c.oop2;

public class Util {

    // 가변 인자 선언
    String concat(String ... strings) {
        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < strings.length; i++) {
//            sb.append(strings[i]);
//        }

        // 향상된 for문
        for (String string : strings) {
            sb.append(string);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Util u = new Util();
        String concatResult = u.concat("H", "e", "l", "l", "o", ",", " ", "W", "o", "r", "l", "d", "!");
        System.out.println("result = " + concatResult);
    }
}
