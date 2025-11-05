package b.oop.practice1;

public class Dog {

    private String name;
    private String breed;

    public Dog(String breed, String name) {
        this.name = name;
        this.breed = breed;
    }

    public void sit() {
        System.out.println(breed + " " + name + "가 앉았습니다.");
    }

    public void hand() {
        System.out.println(breed + " " + name + "가 손을 내밀었습니다.");
    }
}
