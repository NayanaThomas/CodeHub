package codeing;
  class ListNode1 {
	int val;
	ListNode1 next;
	ListNode1(int x) { val = x; }
}

public class RemoveNthEmelementFromLL {
	public ListNode1 removeNthFromEnd(ListNode1 head, int n) {
        ListNode1 firstNode = new ListNode1(0);
        firstNode.next = head;
        int count = 0;
        ListNode1 cur = head;
        while(cur!=null) {
            count++;
            cur = cur.next;
        }
        cur = firstNode;
        count -= n;
        while (count > 0) {
            count--;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return firstNode.next;
    }
	
	public static void main(String args[])
    {
		RemoveNthEmelementFromLL rr = new RemoveNthEmelementFromLL();
		int n =2;
		ListNode1 new1 = new ListNode1(1);
		new1.next = new ListNode1(2);
		new1.next.next = new ListNode1(3);
		new1.next.next.next = new ListNode1(4);
		new1.next.next.next.next = new ListNode1(5);
		new1.next.next.next.next.next = null;
		ListNode1 new2 = new1;
		System.out.println("Before Removing: ");
		while(new1!=null) {
			System.out.print(new1.val+" ");
			new1 = new1.next;
		}
		System.out.println();
		ListNode1 head = rr.removeNthFromEnd(new2,n);
		System.out.println("After Removing: ");
    		while(head!=null) {
    			System.out.print(head.val+" ");
    			head = head.next;
    		}
    }
	
}
