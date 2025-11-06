package c.oop2;

public class MethodType {

    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod() {
        System.out.println("인스턴스 메서드입니다.");
        System.out.println(instanceField);  // 접근 가능
        System.out.println(staticField);    // 접근 가능
    }

    static void staticMethod() {
        System.out.println("스태틱 메서드입니다.");
        System.out.println(staticField);    // 접근 가능
        // System.out.println(instanceField);  // 접근 불가능
    }

    public static void main(String[] args) {
        MethodType methodType = new MethodType();
        methodType.instanceMethod();

        MethodType.staticMethod();

        methodType.staticMethod();  // 호출 가능
        // MethodType.instanceMethod();    // 호출 불가능
    }
}
