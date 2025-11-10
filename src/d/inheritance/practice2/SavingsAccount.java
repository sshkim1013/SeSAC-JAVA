package d.inheritance.practice2;

public class SavingsAccount extends Account {

    // 필드 추가
    double interestRate;

    public SavingsAccount(String accountNumber1, int balance1, double interestRate) {
        super(accountNumber1, balance1);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        System.out.println("이자: " + interest + "원 추가.");
    }
}
