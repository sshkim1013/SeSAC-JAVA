package b.oop.practice1;

public class BankAccount {

    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 입금
    public void deposit(int amount) {
        balance += amount;
        System.out.println("입금: " + amount + "원, 잔액: " + balance + "원");
    }

    // 출금
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금: " + amount + "원, 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 잔액 반환
    public int getBalance() {
        return balance;
    }
}
