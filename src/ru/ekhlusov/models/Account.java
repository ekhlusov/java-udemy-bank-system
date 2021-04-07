package ru.ekhlusov.models;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 */
public class Account {
	private Person person;
	private Bill bill;

	public Account(Person person, Bill bill) {
		this.person = person;
		this.bill = bill;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public int getBillAmount() {
		return bill.getAmount();
	}

	public String getPersonFullName() {
		return person.getName() + " " + person.getSurname();
	}

	@Override
	public String toString() {
		return "Account{" +
				"person=" + person +
				", bill=" + bill +
				'}';
	}
}
