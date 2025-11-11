package d.inheritance.practice3.practice3_3;

public abstract class GameCharacter {

    protected String name;
    protected int attackPower;

    public GameCharacter(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // 템플릿 메서드
    public final void attack() {
        prepare();
        executeAttack();
        finish();
    }

    void prepare() {
        System.out.println(name + "이(가) 공격 준비!");
    }

    abstract void executeAttack();

    void finish() {
        System.out.println("공격 완료!");
    }
}
