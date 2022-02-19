package homework.bank;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    Bank bank = new Bank();
//    int[] transactions1 = new int[0];
    CashMachine machine1 = new CashMachine();
//    int[] transactions2 = new int[0];
    CashMachine machine2 = new CashMachine();

    @BeforeEach
    public void addCashMachine(){
        machine1.addTransactions(10);
        machine1.addTransactions(-11);
        machine2.addTransactions(11);
        machine2.addTransactions(-10);
        bank.add(machine1);
        bank.add(machine2);
    }



    @Test
    void shouldAddMachines(){
        Assert.assertEquals(bank.getMachines().length, 2);
    }

    @Test
    void getBalance() {
        Assertions.assertEquals(0, bank.getBalance());
    }

    @Test
    void howManyDeposits() {Assertions.assertEquals(2, bank.howManyDeposits());
    }

    @Test
    void howManyWithdrawal() {Assertions.assertEquals(2, bank.howManyWithdrawal());
    }

    @Test
    void averageWithdrawal() {Assertions.assertEquals(-10.5, bank.averageWithdrawal());
    }

    @Test
    void averageDeposit() {Assertions.assertEquals(10.5, bank.averageDeposit());
    }

}