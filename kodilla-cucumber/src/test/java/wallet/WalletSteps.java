package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);



    public WalletSteps(){

        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });

        When("I request {int}", (Integer int1) -> {
            cashier.withdrawal(wallet, int1);
        });

        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(int1, cashSlot.getContest());
        });
    }
}
