package d.inheritance.practice2;

public class Account {

    String accountNumber;
    double balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금 되었습니다.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다. 잔액: " + balance);
        }
    }
}
