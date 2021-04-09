package ru.ekhlusov;

/**
 * @author Evgeniy Khlusov
 * 09.04.2021
 */
public class CustomLinkedList<Element> {
	Node<Element> first;
	Node<Element> last;

	public void add(Element element) {
		Node<Element> node;

		if (first == null) {
			node = new Node<>(element, null, null);
			first = node;
		} else {
			node = new Node<>(element, null, last);
			last.next = node;
		}

		last = node;
	}

	public Element get(int index) {
		Node<Element> result = first;

		try {
			for (int i = 0; i < index; i++) {
				result = result.next;
			}
		} catch (NullPointerException e) {
			return null;
		}

		return result.item;
	}

	private static class Node<Element> {
		private Element item;
		private Node<Element> next;
		private Node<Element> prev;

		public Node(Element item, Node<Element> next, Node<Element> prev) {
			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	}
}
