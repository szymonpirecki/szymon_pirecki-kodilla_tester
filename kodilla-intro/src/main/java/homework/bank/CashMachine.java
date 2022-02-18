package homework.bank;

import java.util.Arrays;

public class CashMachine {

    public CashMachine() {
    }

    private int[] transactions = new int[]
            {10, 10, -90, 50, -10};


    public int howManyDeposits(){
        int count = 0;
        for(int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                count++;
            }
        }
        return count;
    }

    public int howManyWithdrawals(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0){
                count ++;
            }
        }
    return count;
    }

    public int getSumOfDeposits(){
        int sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                sum += transactions[i];
            }
        }
        return sum;
    }

    public int getSumOfWithdrawals(){
        int sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0 ){
                sum -= transactions[i];
            }
        }
    return sum;
    }

    public int getSaldo(){
        return Arrays.stream(transactions).sum();
    }
    public int getNumberOfTransactions(){
        return transactions.length;
    }
    }


