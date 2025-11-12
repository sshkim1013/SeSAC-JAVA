package e.generic;

class NumberBox<T extends Number> {

    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Double getDoubleValue() {
        return value.doubleValue();
    }
}

class SortedBox<T extends Comparable<T>> {

    private T value;

    public SortedBox(T value) {
        this.value = value;
    }

    public boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;

        // .compareTo() 메서드: 두 값을 반환해서 int로 반환 한다.
    }
}

public class ExtendsGeneric {
    public static void main(String[] args) {
        NumberBox<Integer> nb1 = new NumberBox<>(10);
        Integer integerValue = nb1.getValue();
        System.out.println(nb1.getDoubleValue());   // 10.0

        NumberBox<Double> nb2 = new NumberBox<>(3.14);
        Double doubleValue = nb2.getValue();
        System.out.println(nb2.getDoubleValue());   // 3.14

        // 생성 불가능: String은 Number의 자식이 아니기 때문!
        // NumberBox<String> nb3 = new NumberBox<>("A");

        // ------------------

        SortedBox<Integer> sb1 = new SortedBox<>(10);
        System.out.println(sb1.isGreaterThan(5));
    }
}
