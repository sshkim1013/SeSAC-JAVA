package c.oop2;

public class Person {
    String name;
    int age;
    String address;

    // 기본 생성자
    public Person() {
        this.name = "noname";
        this.age = 0;
    }

    // new Person("Kim", 10);
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        // this.name = name;
        // this.age = age;
        this(name, age);    // 인스턴스 내 다른 생성자를 호출 / 중복 제거 효과
        this.address = address;
    }
}
