package codeing;

import java.util.*;

// Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class addTwoNumLinkList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode list1 = l1, list2 = l2, curr = newList;
        int val1, val2, sum, carry = 0;
        while(list1 != null || list2 != null) {
            if(list1!=null) {
                val1 = list1.val;
            }
            else {
                val1 = 0;
            }
            if(list2!=null) {
                val2 = list2.val;
            }
            else {
                val2 = 0;
            }
            sum = val1 + val2 + carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(list1!=null) {
                list1=list1.next;
            }
            if(list2!=null){
                list2=list2.next;
            }
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        } 
        return newList.next;
    }
    public static void main(String args[]) {
    		//Scanner in = new Scanner(System.in);
    		addTwoNumLinkList sll = new addTwoNumLinkList();
    		ListNode l1 = new ListNode(2);
    		l1.next = new ListNode(4);
    		l1.next = new ListNode(3);
    		l1.next = null;
    		ListNode l2 = new ListNode(5);
    		l2.next = new ListNode(6);
    		l2.next = new ListNode(8);
    		l2.next = null;
    		ListNode sumedList = sll.addTwoNumbers(l1, l2);
    		System.out.println("Sum is: ");
    		while(sumedList!=null) {
    			System.out.print(sumedList.val);
    			if(sumedList.next!=null) {
    				sumedList = sumedList.next;
    			}
    		}
    }
}