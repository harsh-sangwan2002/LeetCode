/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){

            int d1 = l1==null?0:l1.val;
            int d2 = l2==null?0:l2.val;
            int sum = d1+d2+carry;

            int digit = sum%10;
            carry = sum/10;

            ListNode node = new ListNode(digit);
            temp.next = node;
            temp = temp.next;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }

        return head.next;
    }
}