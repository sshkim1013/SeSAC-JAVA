package d.inheritance.practice4.practice4_2;

public class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("신용카드(" + cardNumber + ")로 " + amount + "원 결제 완료");
    }

    @Override
    public String getPaymentMethod() {
        return "신용카드";
    }
}
