package homework.bank;

public class Bank {


    private CashMachine machine;

    CashMachine[] machines = new CashMachine[]
            {new CashMachine()};


    public int getBalance(){
        int balance = 0;
        for (CashMachine cashMachine : machines) {
            balance += cashMachine.getSaldo();
        }
        return balance;
    }

    public int howManyDeposits(){
        int count = 0;
        for (CashMachine cashMachine : machines){
           int[] transactions = cashMachine.getTransactions();
            for(int i = 0; i < transactions.length; i++){
                if (transactions[i] > 0){
                    count++;
                }
            }
        }
        return count;
    }

    public int howManyWithdrawal(){
        int count = 0;
        for (CashMachine cashMachine : machines){
            int[] transactions = cashMachine.getTransactions();
            for(int i = 0; i < transactions.length; i++){
                if (transactions[i] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public int averageWithdrawal(){
        int count = 0;
        int sum = 0;
        for (CashMachine cashMachine : machines){
            int[] transactions = cashMachine.getTransactions();
            for(int i = 0; i < transactions.length; i++){
                if (transactions[i] < 0){
                    count++;
                    sum += transactions[i];
                }

            }
        }
        return sum/count;
    }

    public int averageDeposit(){
        int count = 0;
        int sum = 0;
        for (CashMachine cashMachine : machines){
            int[] transactions = cashMachine.getTransactions();
            for(int i = 0; i < transactions.length; i++){
                if (transactions[i] > 0){
                    count++;
                    sum += transactions[i];
                }
            }
        }
        return sum/count;
    }

}