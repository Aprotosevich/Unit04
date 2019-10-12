package by.epam.homework.by.epam.homework.task03.service;

import by.epam.homework.by.epam.homework.task03.entity.AbstractAccount;
import by.epam.homework.by.epam.homework.task03.entity.Client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ClientService {

    private static Logger logger = Logger.getLogger("ClientService logger");

    public void addAccount(Client client, AbstractAccount abstractAccount) {
        List<AbstractAccount> accounts = client.getAccounts();
        int id = client.getAccounts_quantity();
        abstractAccount.account_id = ++id;
        accounts.add(abstractAccount);
        client.setAccounts(accounts);
        client.setAccounts_quantity(id);
    }

    public String takeAllAccountsInfo(Client client){
        StringBuilder sb = new StringBuilder();
        client.getAccounts().forEach(element -> sb.append(element).append("\n"));
        return sb.toString();
    }

    public AbstractAccount takeAccountById(Client client, int id) {
        try {
            return client
                    .getAccounts()
                    .stream()
                    .filter(n -> n.account_id == id)
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            logger.warning("Cannot find such element!");
            return null;
        }
    }

    public int takeBalance(Client client) {
        return client.getAccounts()
                .stream()
                .mapToInt(account -> account.curr_amount)
                .sum();
    }

    public int takeDebitBalance(Client client) {
        return client.getAccounts()
                .stream()
                .filter(account -> account.curr_amount > 0)
                .mapToInt(filtredAccount -> filtredAccount.curr_amount)
                .sum();
    }

    public int takeCreditBalance(Client client) {
        return - client.getAccounts()
                .stream()
                .filter(account -> account.curr_amount <0)
                .mapToInt(filtredAccount -> - (filtredAccount.curr_amount))
                .sum();
        // кредитные значения храним с знаком минус.
    }

    public void sortAccountsByValue (Client client) {
        List<AbstractAccount> list = client.getAccounts()
                .stream()
                .sorted(Comparator.comparing(acc -> acc.curr_amount))
                .collect(Collectors.toList());
        client.setAccounts(list);
    }
}

