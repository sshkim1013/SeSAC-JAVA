package d.inheritance;

class Parent {

    String name = "parent";

    void show() {
        System.out.println("Parent.show");
    }
}

class Child extends Parent {

    String name = "child";

    @Override
    void show() {
        System.out.println("Child.show");
    }
}

public class OverridingMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent child2 = new Child();

        System.out.println(child2.name);

        parent.show();
        child.show();
        child2.show();
    }
}
