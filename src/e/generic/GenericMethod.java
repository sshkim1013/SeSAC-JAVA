package e.generic;

public class GenericMethod {

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);   // 1 2 3 4 5

        swap(intArray, 1, 3);
        printArray(intArray);   // 1 4 3 2 5

        String[] stringArray = {"A", "B", "C"};
        printArray(stringArray);    // A B C

        swap(stringArray, 0, 2);
        printArray(stringArray);    // C B A
    }
}
