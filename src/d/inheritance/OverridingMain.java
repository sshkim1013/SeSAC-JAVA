package d.inheritance;

class Parent {

    String name = "parent";

    void show() {
        System.out.println("Parent.show");
    }

    final void display() {
        System.out.println("Parent.display");
    }
}

class Child extends Parent {

    String name = "child";

    @Override
    void show() {
        System.out.println("Child.show");
    }

    // 부모에서 final 키워드가 붙은 메서드는 재정의 불가능!!
    // @Override
    // void display() {
    //     System.out.println("Child.display");
    // }
}

public class OverridingMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent child2 = new Child();

        parent.show();
        child.show();
        child2.show();

        // 필드는 오버라이딩 되지 않음.
        System.out.println(child2.name);
    }
}
