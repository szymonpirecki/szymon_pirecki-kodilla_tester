package wallet;

public class CashSlot {

    private int contest;

    public Integer getContest(){
        return contest;
    }

    public void dispense(int amount){
        this.contest = amount;

    }
}
