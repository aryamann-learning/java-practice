package com.java.collections;

public class LinkedList {
	Node head;

	public void push(int new_data) {
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	public void delete(int position) {
		if (head == null)
			return;

		Node temp = head;

		if (position == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;

		if (temp == null || temp.next == null)
			return;

		Node next = temp.next.next;

		temp.next = next;
	}
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		lst.push(1);
		lst.push(2);
		lst.push(3);
		lst.push(4);
		lst.push(5);

		lst.delete(3);
		lst.printList();
	}
}