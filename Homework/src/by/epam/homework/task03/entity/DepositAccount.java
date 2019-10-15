package by.epam.homework.task03.entity;

import java.util.Objects;

public class DepositAccount extends AbstractAccount {

    private boolean revocable; // отзывной вклад или нет
    private int depositMonthRate;

    public DepositAccount(int depositAmount, boolean revocable, int depositValue) {
        curr_amount = depositAmount;
        this.revocable = revocable;
        if (revocable) {
            min_amount = 0;
        }
        else {
            min_amount = depositAmount;
        }
        max_amount = Integer.MAX_VALUE;
        depositMonthRate = STATE_MONTH_RATE + depositValue;
    }

    public boolean isRevocable() {
        return revocable;
    }

    public void setRevocable(boolean revocable) {
        this.revocable = revocable;
    }

    public int getDepositMonthRate() {
        return depositMonthRate;
    }

    public void setDepositMonthRate(int depositMonthRate) {
        this.depositMonthRate = depositMonthRate;
    }

    @Override
    public String toString() {
        return "DepositAccount. Id: " + account_id + ". Current amount: " + curr_amount +
                " revocable: " + revocable +
                ", depositMonthRate: " + depositMonthRate + "%. ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DepositAccount that = (DepositAccount) o;
        return revocable == that.revocable &&
                depositMonthRate == that.depositMonthRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), revocable, depositMonthRate);
    }
}
