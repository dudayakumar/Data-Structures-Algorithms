/*
 * Creating simple linked list with 3 nodes
 */
package linkedList;

public class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		lList.head.next = second;
		second.next = third;
		
		lList.printList();
	}
	
	static void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
