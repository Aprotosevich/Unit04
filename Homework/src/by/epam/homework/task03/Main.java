package by.epam.homework.task03;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
        Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
        имеющим положительный и отрицательный балансы отдельно. */

import by.epam.homework.task03.service.ClientService;
import by.epam.homework.task03.entity.Client;
import by.epam.homework.task03.entity.CreditAccount;
import by.epam.homework.task03.entity.DepositAccount;
import by.epam.homework.task03.entity.SalaryAccount;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ClientService clientService = new ClientService();
        Client client = main.createClientForTask(clientService);

        System.out.println(clientService.takeAllAccountsInfo(client));

        System.out.println(clientService.takeAccountById(client, 4));
        System.out.println("Sum: " + clientService.takeBalance(client));
        System.out.println("Debit: " + clientService.takeDebitBalance(client));
        System.out.println("Credit: " + clientService.takeCreditBalance(client));
        clientService.sortAccountsByValue(client);
        System.out.println(clientService.takeAllAccountsInfo(client));
    }

    private Client createClientForTask(ClientService clientService) {
        Client client = new Client();
        SalaryAccount salaryAccount = new SalaryAccount();
        DepositAccount depositAccount = new DepositAccount(5_000, false, 1);
        CreditAccount creditAccount = new CreditAccount(45_000, 5);
        CreditAccount creditAccount1 = new CreditAccount(2_500, 8);
        CreditAccount creditAccount2 = new CreditAccount(800, 10);

        clientService.addAccount(client, salaryAccount);
        clientService.addAccount(client, depositAccount);
        clientService.addAccount(client, creditAccount);
        clientService.addAccount(client, creditAccount1);
        clientService.addAccount(client, creditAccount2);

        return client;
    }
}
