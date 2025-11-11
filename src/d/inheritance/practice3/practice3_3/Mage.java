package d.inheritance.practice3.practice3_3;

public class Mage extends GameCharacter {

    public Mage(String name) {
        super(name, 80);
    }

    @Override
    void executeAttack() {
        System.out.println("마법 공격! 데미지: " + attackPower);
    }
}
