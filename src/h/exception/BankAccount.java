package h.exception;

// 커스텀 예외 처리
class InsufficientBalanceException extends Exception {
    private int current;
    private int request;

    public InsufficientBalanceException(int current, int request) {
        super("잔액 부족: " + current + " / " + request);
        this.current = current;
        this.request = request;
    }
}

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        try {
            bankAccount.withdraw(12000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Problem");
        }
        System.out.println(bankAccount.getBalance());
    }
}
