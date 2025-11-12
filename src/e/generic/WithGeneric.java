package e.generic;

class Box2<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class WithGeneric {

    public static void main(String[] args) {
        Box2<String> stringBox = new Box2<>();
        Box2<Integer> integerBox = new Box2<>();

        stringBox.setItem("Hello");
        // stringBox.setItem(123);   // 불가능

        integerBox.setItem(123);
        // integerBox.setItem("Hello");  // 불가능

        System.out.println(stringBox.getItem());
        System.out.println(integerBox.getItem());
    }
}
