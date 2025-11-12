package e.generic.practice1.practice1_3;

public class ArrayUtil {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static <T> T getLast(T[] array) {
        return array[array.length - 1];
    }
}
