package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawal(Wallet wallet, int amount){
        if (amount <= wallet.getBalance()){
            cashSlot.dispense(amount);
        }else {
        cashSlot.dispense(0);
    }
}
}
