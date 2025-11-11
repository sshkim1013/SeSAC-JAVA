package d.inheritance.practice1.practice1_2;

public class CheckingAccount extends Account{

    // 필드 추가
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }

        System.out.println("잔액이 부족합니다. balance = " + balance);
    }
}
