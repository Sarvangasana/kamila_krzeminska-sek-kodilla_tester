package wallet;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();

    Cashier cashier = new Cashier(new CashSlot());

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashSlot.dispense(30);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
            Assert.assertEquals(170, wallet.getBalance());
        });

        When("I deposit $50", () -> {
            Assert.assertEquals(170, wallet.getBalance());
            wallet.deposit(50);
        });

        Then("the balance of my wallet should be $220", () -> {
            Assert.assertEquals(220, wallet.getBalance());
        });

        When("I request $100", () -> {
            wallet.debit(100);
        });

        Then("the balance of my wallet should be $120", () -> {
            Assert.assertEquals(120, wallet.getBalance());
        });

        When("I request $150", () -> {
            wallet.debit(150);
        });

        When("I request $0", () -> {
            wallet.debit(0);
        });

        Then("the balance of my wallet should be still $120", () -> {
            Assert.assertEquals(120, wallet.getBalance());
        });
    }
}
