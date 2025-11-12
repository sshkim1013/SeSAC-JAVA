package e.generic;

class Container<T> {

    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class SingleType {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        System.out.println(stringContainer.getValue()); // Hello <- 문자열

        Container<Integer> integerContainer = new Container<>(1);
        System.out.println(integerContainer.getValue());    // 1 <- 숫자(정수)
    }
}
