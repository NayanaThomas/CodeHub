package codeing;
// Not Running
public class LinkedlistSum {
	Node head1 = null;
	Node head2 = null;
	static class Node {
		int data;
		Node next;
	
		Node(int item) {
			data = item;
			next = null;
		}
	}
	public Node addTwoLinkedlist(Node first, Node second) {
		Node previous = null;
		Node temp = null;
		Node res = null;
		int carry = 0;
		int sum = 0;
		while(first!=null || second!=null) {
			sum = (first!=null?first.data:0) + (second!=null?second.data:0) + carry;
			carry = (sum>=10?sum/10:0);
			sum = sum%10;
			temp = new Node(sum);
			if(res==null) {
				res = temp;
			}
			else {
				previous.next = temp;
			}
			previous=temp;
			if(first.next!=null) {
				first = first.next;
			}
			if(second.next!=null) {
				second = second.next;
			}
		}
		if(carry!=0) {
			temp.next = new Node(carry);
		}
		return res;
	}
	public void printList(Node res) {
		while(res!=null) {
			System.out.print(res.data);
			res=res.next;
		}
	}
	public static void main(String[] args) {
		LinkedlistSum list = new LinkedlistSum();
		list.head1 = new Node(7);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(6);

		list.head2 = new Node(5);
		list.head2.next = new Node(9);
		list.head2.next.next = new Node(3);

		Node res = list.addTwoLinkedlist(list.head1,list.head2);
		list.printList(res);
	}

} 
