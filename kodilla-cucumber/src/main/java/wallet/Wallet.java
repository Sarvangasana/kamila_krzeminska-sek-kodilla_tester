package wallet;

public class Wallet {
private int balance = 0;
    public Wallet(){
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void debit(int money) {
        if (money <= this.balance) {
            this.balance -= money;
        } else if (money <= 0) {
            System.out.println("You cannot request for 0 or negative number of money. Please enter positive number");
        } else {
            System.out.println("You haven't that much money");
        }

    }

    public int getBalance() {
        return balance;
    }
}
