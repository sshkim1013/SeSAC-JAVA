package d.inheritance.practice4.practice4_3;

public class Duck implements Swimmable, Flyable {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "이(가) 날아갑니다");
    }

    @Override
    public void swim() {
        System.out.println(name + "이(가) 수영합니다");
    }
}
