package ru.ekhlusov;

import ru.ekhlusov.models.Account;
import ru.ekhlusov.models.Bill;
import ru.ekhlusov.models.Person;
import ru.ekhlusov.services.DepositService;
import ru.ekhlusov.services.PaymentService;
import ru.ekhlusov.services.TransferService;

public class Main {

    public static void main(String[] args) {
        // User 1
        Bill bill1 = new Bill(5000);
        Person person1 = new Person("Евгений", "Иванов", "88005553535");
        Account account1 = new Account(person1, bill1);

        // User 2
        Bill bill2 = new Bill(1000);
        Person person2 = new Person("Игорь", "Сидоров", "88005553444");
        Account account2 = new Account(person2, bill2);

        System.out.println(account1);
        System.out.println(account2);

        DepositService depositService = new DepositService();
        depositService.makeTransaction(account1, 5000);

        PaymentService paymentService = new PaymentService();
        paymentService.makeTransaction(account2, 500);

        TransferService transferService = new TransferService();
        transferService.transfer(account1, account2, 500);
    }
}
