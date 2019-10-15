package by.epam.homework.task03.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditAccount that = (CreditAccount) o;
        return creditMonthRate == that.creditMonthRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creditMonthRate);
    }
}
