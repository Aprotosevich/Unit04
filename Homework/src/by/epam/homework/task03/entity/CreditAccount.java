package by.epam.homework.task03.entity;

public class CreditAccount extends AbstractAccount {

    private int creditMonthRate;

    public CreditAccount(int creditMoneyTaken, int creditValue) {
        curr_amount = - (creditMoneyTaken);
        min_amount = creditMoneyTaken;
        max_amount = 0;
        creditMonthRate = STATE_MONTH_RATE + creditValue;
    }

    public int getCreditMonthRate() {
        return creditMonthRate;
    }

    public void setCreditMonthRate(int creditMonthRate) {
        this.creditMonthRate = creditMonthRate;
    }

    @Override
    public String toString() {
        return "CreditAccount. Id: " + account_id + ". Current amount:  " + curr_amount +
                " creditMonthRate: " + creditMonthRate + "%. ";
    }

}
