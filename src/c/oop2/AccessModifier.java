package c.oop2;

public class AccessModifier {

    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass(10);

        // pc.value = 100; -> 에러

        pc.resetValue();
        System.out.println(pc.getValue());

        // public
        pc.value2 = "test";
    }
}
