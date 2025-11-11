package d.inheritance.practice3.practice3_3;

public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name, 50);
    }

    @Override
    void executeAttack() {
        System.out.println("검으로 베기! 데미지: " + attackPower);
    }
}
