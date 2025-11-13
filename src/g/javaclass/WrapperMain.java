package g.javaclass;

public class WrapperMain {

    public static void main(String[] args) {
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive);   // 박싱
        System.out.println(wrapper);    // 10

        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 = wrapper2.intValue();   // 언박싱
        System.out.println(primitive2); // 20

        // 오토 박싱
        Integer wrapper3 = 10;
        // 오토 언박싱
        int primitive3 = wrapper3;

        // Integer w = null;
        // int v = w;
        // System.out.println(v);  // NullPointerException

        // 파싱: 문자열 -> 숫자
        int parsed = Integer.parseInt("123");
        System.out.println(parsed); // 123(숫자)

        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b)); // -1 (10이 20보다 작다)
    }
}
