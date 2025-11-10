package d.inheritance.practice2;

public class CheckingAccount extends Account{

    // 필드 추가
    double overdraftLimit;

    public CheckingAccount(String accountNumber1, int balance1, int overdraftLimit) {
        super(accountNumber1, balance1);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }

        System.out.println("잔액이 부족합니다.");
    }
}
