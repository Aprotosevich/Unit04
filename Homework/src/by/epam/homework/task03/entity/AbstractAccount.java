package by.epam.homework.task03.entity;

import java.util.Objects;

public class AbstractAccount {

    public int curr_amount;
    public int min_amount;
    public int max_amount;
    public int account_id;

    public static final int STATE_MONTH_RATE = 3; // берем ставку рефинс. и сразу переводим в месячную (для этой задачи).

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAccount that = (AbstractAccount) o;
        return curr_amount == that.curr_amount &&
                min_amount == that.min_amount &&
                max_amount == that.max_amount &&
                account_id == that.account_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(curr_amount, min_amount, max_amount, account_id);
    }
}
