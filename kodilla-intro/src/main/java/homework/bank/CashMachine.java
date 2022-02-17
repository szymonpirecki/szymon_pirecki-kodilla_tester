package homework.bank;

import java.util.Arrays;

public class CashMachine {

    public CashMachine() {

    }
    private int[] transactions = new int[]
            {10, 10, -90, 50};

    public int[] getTransactions() {
        return transactions;
    }
    public int getSaldo(){
        return Arrays.stream(transactions).sum();
    }
    public int getNumberOfTransactions(){
        return transactions.length;
    }


    }


