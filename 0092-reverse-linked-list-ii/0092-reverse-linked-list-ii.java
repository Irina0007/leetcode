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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        ListNode lprev=dummy;
        dummy.next=head;
        ListNode cur=head;
        for(int i=0;i<left-1;i++){
            cur=cur.next;
            lprev=lprev.next;
        }
        ListNode rprev=null;
        ListNode ltail=cur;
        for(int i=0;i<right-left+1;i++){
            ListNode next=cur.next;
            cur.next=rprev;
            rprev=cur;
            cur=next;
        }
        lprev.next=rprev;
        ltail.next=cur;

      return dummy.next;  
    }
}