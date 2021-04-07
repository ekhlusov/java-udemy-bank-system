package ru.ekhlusov.models;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 */
public class Deposit {
	private Bill bill;

	public Deposit(Bill bill) {
		this.bill = bill;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
}
