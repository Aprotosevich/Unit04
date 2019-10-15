package by.epam.homework.task03.entity;

public class SalaryAccount extends AbstractAccount {

    public SalaryAccount() {
        curr_amount = 0;
        max_amount = Integer.MAX_VALUE;
        min_amount = 0;
    }

    @Override
    public String toString() {
        return "SalaryAccount. Id: " + account_id + ". Current amount: " + curr_amount + ". ";
    }

}
