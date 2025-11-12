package e.generic;

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class MultiType {

    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("name", "Kim");
        System.out.println(pair1.getKey() + ": " + pair1.getValue());

        Pair<String, Integer> pair2 = new Pair<>("age", 27);
        System.out.println(pair2.getKey() + ": " + pair2.getValue());
    }
}
