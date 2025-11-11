package d.inheritance.practice1.practice1_2;

public class SavingsAccount extends Account {

    // 필드 추가
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자 " + interest + "원 추가");
    }
}
