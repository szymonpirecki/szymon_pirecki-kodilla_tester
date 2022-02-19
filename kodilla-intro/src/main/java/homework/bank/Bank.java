package homework.bank;

public class Bank {

    private CashMachine[] machines = new CashMachine[0];
    private int size = 0;

    public CashMachine[] getMachines() {
        return machines;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.size - 1] = cashMachine;
        this.machines = newTab;
    }

    public double getBalance(){
        double balance = 0;
        for (CashMachine cashMachine : machines) {
            balance += cashMachine.getSaldo();
        }
        return balance;
    }

    public double howManyDeposits(){
        double count = 0;
        for (CashMachine cashMachine : machines){
            count += cashMachine.howManyDeposits();
        }
        return count;
    }

    public double howManyWithdrawal(){
        double count = 0;
        for (CashMachine cashMachine : machines){
            count += cashMachine.howManyWithdrawals();
        }
        return count;
    }

    public double averageWithdrawal(){
        double count = 0;
        double sum = 0;
        for (CashMachine cashMachine : machines){
         count += cashMachine.howManyWithdrawals();
         sum -= cashMachine.getSumOfWithdrawals();
        }
        return sum/count;
    }

    public double averageDeposit(){
        double count = 0;
        double sum = 0;
        for (CashMachine cashMachine : machines){
            count += cashMachine.howManyDeposits();
            sum += cashMachine.getSumOfDeposits();
        }
        return sum/count;
    }
}