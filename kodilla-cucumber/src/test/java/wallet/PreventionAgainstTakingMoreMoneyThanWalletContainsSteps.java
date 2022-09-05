package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventionAgainstTakingMoreMoneyThanWalletContainsSteps implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(new CashSlot());
    String answer;

    public PreventionAgainstTakingMoreMoneyThanWalletContainsSteps() {
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            answer = wallet.debit(200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You haven't that much money", answer);
// jak przetestować, że metoda VOID debit() wyświetla "You haven't that much money" - to się wyświetla w konsoli
            // podczas testów, ale nie ma asercji żeby to przetestować więc jak rozpisać w step-ach ten warunek AND?
        });
    }
}
