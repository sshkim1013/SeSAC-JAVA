package c.oop2;

public class Singleton {

    private static Singleton instance = null;

    // 외부에서의 인스턴스 생성을 막음
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
