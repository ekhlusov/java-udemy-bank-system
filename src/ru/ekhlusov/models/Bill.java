package ru.ekhlusov.models;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 */
public class Bill {
	private int amount;

	public Bill(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bill{" +
				"amount=" + amount +
				'}';
	}
}
