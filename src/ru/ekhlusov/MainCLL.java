package ru.ekhlusov;

/**
 * @author Evgeniy Khlusov
 * 09.04.2021
 */
public class MainCLL {
	public static void main(String[] args) {
		CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

		customLinkedList.add("TEST");
		customLinkedList.add("TEST1");
		customLinkedList.add("TEST2");

		System.out.println(customLinkedList.get(0));
	}
}
