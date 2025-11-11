package d.inheritance.practice4.practice4_3;

public class Bird implements Flyable {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "이(가) 하늘을 날아갑니다");
    }
}
