package ru.ekhlusov.services;

import ru.ekhlusov.models.Account;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 * увеличение счета
 */
public class DepositService {
	public void makeTransaction(Account account, int amount) {
		int amountUser = account.getBillAmount();
		account.getBill().setAmount(amountUser + amount);

		System.out.println("Пополнение баланса: " + amount);
		System.out.println("Новый баланс: " + account.getPersonFullName() + ": " + account.getBillAmount());
	}
}
