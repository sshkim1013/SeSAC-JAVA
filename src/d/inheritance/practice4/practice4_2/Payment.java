package d.inheritance.practice4.practice4_2;

public interface Payment {

    void processPayment(int amount);

    String getPaymentMethod();

    default void printReceipt(int amount) {
        System.out.println("영수증: " + amount + "원 - " + getPaymentMethod());
    }
}
