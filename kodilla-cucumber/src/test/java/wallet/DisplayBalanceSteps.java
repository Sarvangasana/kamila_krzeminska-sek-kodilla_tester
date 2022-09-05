package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(new CashSlot());

    public DisplayBalanceSteps() {
        Given("I have $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
    }


}
