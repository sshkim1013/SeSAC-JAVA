package d.inheritance.practice1.practice1_1;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다. 나이는 " + age + "살 입니다.");
    }
}
