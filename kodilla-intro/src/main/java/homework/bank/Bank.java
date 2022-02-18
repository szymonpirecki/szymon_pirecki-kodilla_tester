package homework.bank;

public class Bank {

   private CashMachine[] machines = new CashMachine[]
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
            count += cashMachine.howManyDeposits();
        }
        return count;
    }

    public int howManyWithdrawal(){
        int count = 0;
        for (CashMachine cashMachine : machines){
            count += cashMachine.howManyWithdrawals();
        }
        return count;
    }

    public int averageWithdrawal(){
        int count = 0;
        int sum = 0;
        for (CashMachine cashMachine : machines){
         count += cashMachine.howManyWithdrawals();
         sum -= cashMachine.getSumOfWithdrawals();
        }
        return sum/count;
    }

    public int averageDeposit(){
        int count = 0;
        int sum = 0;
        for (CashMachine cashMachine : machines){
            count += cashMachine.howManyDeposits();
            sum += cashMachine.getSumOfDeposits();
        }
        return sum/count;
    }
}