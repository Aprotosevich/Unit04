package by.epam.homework.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private int accounts_quantity = 0;

    private String name;
    private List<AbstractAccount> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AbstractAccount> accounts) {
        this.accounts = accounts;
    }

    public int getAccounts_quantity() {
        return accounts_quantity;
    }

    public void setAccounts_quantity(int accounts_quantity) {
        this.accounts_quantity = accounts_quantity;
    }

    @Override
    public String toString() {
        return "Client{" +
                "accounts_quantity=" + accounts_quantity +
                ", name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return accounts_quantity == client.accounts_quantity &&
                Objects.equals(name, client.name) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts_quantity, name, accounts);
    }
}
