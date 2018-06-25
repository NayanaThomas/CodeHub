package codeing;
//NOT RUNNUNG
public class DoublyLinkedListDeletion {
	static Node head = null;

	static class Node {
		int data;
		Node prev, next;

		Node(int item) {
			data = item;
			prev= next = null;
		}
	}

	public void push(Node head, int data) {
		Node newNode = new Node(data);
		newNode.prev = null;
		newNode.next = head;
		if(head!=null) {
			head.prev = newNode;
		}
		head = newNode;
	}

	public void deleteNode(Node head, Node del) {
		if(head==null || del == null) {
			return;
		}
		if(head==del) {
			head = head.next;
		}
		if(del.next!=null) {
			del.next.prev = del.prev;
		}
		if(del.prev!=null) {
			del.prev.next = del.next;
		}
		return;
	}

	public void printList(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void main(String[] args) {
		DoublyLinkedListDeletion list = new DoublyLinkedListDeletion();
		list.push(head, 2);
		list.push(head, 4);
		list.push(head, 6);
		list.push(head, 8);

		list.printList(head);

		list.deleteNode(head, head);
		list.deleteNode(head, head.next);
		list.deleteNode(head, head.next.next);

		list.printList(head);

	}
}

