package homework.bank;

import java.util.Arrays;

public class CashMachine {

    private double[] transactions = new double[0];
    private int size;

    public CashMachine() {
    }

    public void addTransactions(double transaction){
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

//    private int[] transactions = new int[]
//            {10, 10, -90, 50, -10};


    public double howManyDeposits(){
        double count = 0;
        for(int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                count++;
            }
        }
        return count;
    }

    public double howManyWithdrawals(){
        double count = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0){
                count ++;
            }
        }
    return count;
    }

    public double getSumOfDeposits(){
        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                sum += transactions[i];
            }
        }
        return sum;
    }

    public double getSumOfWithdrawals(){
        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0 ){
                sum -= transactions[i];
            }
        }
    return sum;
    }

    public double getSaldo(){
        return Arrays.stream(transactions).sum();
    }
    public double getNumberOfTransactions(){
        return transactions.length;
    }
    }


