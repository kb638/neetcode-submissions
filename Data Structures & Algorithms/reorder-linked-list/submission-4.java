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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

        }

        ListNode revhead=slow.next;
        ListNode prev=null;
        slow.next=null;
        while(revhead!=null){
            ListNode temp=revhead.next;
            revhead.next=prev;
            prev=revhead;
            revhead=temp;
        }

        ListNode first=head;
        ListNode sechead=prev;
        while(sechead!=null){
            ListNode temp1=first.next;
            ListNode temp2=sechead.next;
            first.next=sechead;
            sechead.next=temp1;
            first=temp1;
            sechead=temp2;
        }
        

    }
}
