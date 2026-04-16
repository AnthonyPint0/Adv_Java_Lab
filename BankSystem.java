// Bank Account class
class BankAccount {
    private int balance = 1000;

    // synchronized method to deposit money
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited: " + amount + " | Balance: " + balance);
    }

    // synchronized method to withdraw money
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount + " but insufficient balance.");
        }
    }
}

// Thread for Deposit
class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(500);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Thread for Withdraw
class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(300);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);
        t1.setName("User-1");
        t2.setName("User-2");
        t1.start();
        t2.start();
    }
}