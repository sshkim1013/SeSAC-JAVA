package c.oop2;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(2, 3);
        System.out.println(result);
        int result2 = cal.add(4, 5, 6);
        System.out.println(result2);
        int result3 = cal.add(1, 2, 3, 4, 5);
        System.out.println(result3);

        Person person1 = new Person();
        Person person2 = new Person("Kim", 10);
        // Person person3 = new Person("Lee"); // 사용 불가

        Person person3 = new Person("Lee", 30, "서울");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle(20, 30);
    }
}
