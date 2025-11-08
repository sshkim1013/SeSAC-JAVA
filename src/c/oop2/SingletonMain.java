package c.oop2;

public class SingletonMain {

    public static void main(String[] args) {
        // 생성 불가능 - 생성자의 접근제어자가 private
        // Singleton singleton = new Singleton();

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 == instance2 : " + (instance1 == instance2));
    }
}
