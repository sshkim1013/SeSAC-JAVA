package e.generic;

class Parent<T> {

    private T value;

    public Parent(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Child<T> extends Parent<T> {

    public Child(T value) {
        super(value);
    }
}

class StringChild extends Parent<String> {

    public StringChild(String value) {
        super(value);
    }
}

// 확장
class ExtendsChild<T, U> extends Parent<T> {

    private U value2;

    public ExtendsChild(T value, U value2) {
        super(value);
        this.value2 = value2;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Parent<String> p1 = new Parent<>("Hello");
        Child<String> c1 = new Child<>("Hi");
        StringChild sc1 = new StringChild("Hi");
        ExtendsChild<String, Integer> ec1 = new ExtendsChild<>("Kim", 27);
    }
}
