package by.epam.homework.task03.service;

import by.epam.homework.task03.entity.CreditAccount;
import by.epam.homework.task03.entity.DepositAccount;

import java.util.logging.Logger;

/* Если создатут другие к-ры .getDepositMonthRate может вызвать неккоректное значение */

public class AccountService {

    private static Logger logger = Logger.getLogger("AccountService Logger");

    public void oneMonthIncrease(DepositAccount depositAccount) {
        int value = depositAccount.curr_amount;
        try {
            double newValue = value + value * ((double)depositAccount.getDepositMonthRate() / 100);
            depositAccount.curr_amount = (int) newValue;
        } catch (Exception e) {
            depositAccount.curr_amount = value;
            logger.warning("Something wrong with increasing amount of depositAccount");
        }
    }

    public void oneMonthDecrease(CreditAccount creditAccount) {
        int value = - (creditAccount.curr_amount);
        try {
            double newValue = value + value * ((double)creditAccount.getCreditMonthRate() / 100);
            creditAccount.curr_amount = - (int)newValue;
        } catch (Exception e) {
            creditAccount.curr_amount = value;
            logger.warning("Something wrong with decreasing amount of creditAccount");
        }
    }

}
