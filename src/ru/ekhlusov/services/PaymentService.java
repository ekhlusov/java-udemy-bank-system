package ru.ekhlusov.services;

import ru.ekhlusov.models.Account;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 * уменьшение счета
 */
public class PaymentService {
	public void makeTransaction(Account account, int amount) {
		int amountUser = account.getBillAmount();

		if (amountUser < amount) {
			System.out.println("Недостаточно средств");
		} else {
			account.getBill().setAmount(amountUser - amount);
			System.out.println("Платеж: " + amount);
			System.out.println("Новый баланс: " + account.getPersonFullName() + ": " + account.getBillAmount());
		}
	}
}
