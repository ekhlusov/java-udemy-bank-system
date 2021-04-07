package ru.ekhlusov.services;

import ru.ekhlusov.models.Account;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 * Перевод денег с одного аккаунта на другой
 */
public class TransferService {
	public void transfer(Account accountFrom, Account accountTo, int amount) {
		int amountFrom = accountFrom.getBillAmount();
		int amountTo = accountTo.getBillAmount();

		if (amountFrom < amount) {
			System.out.println(accountFrom.getPersonFullName() + ". Недостаточно средств");
		} else {
			accountFrom.getBill().setAmount(amountFrom - amount);
			accountTo.getBill().setAmount(amountTo + amount);

			System.out.println("Новый баланс: " + accountFrom.getPersonFullName() + ": " + accountFrom.getBillAmount());
			System.out.println("Новый баланс: " + accountTo.getPersonFullName() + ": " + accountTo.getBillAmount());
		}
	}
}
