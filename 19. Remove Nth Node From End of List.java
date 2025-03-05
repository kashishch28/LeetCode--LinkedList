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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0;i<=n;i++){
            first = first.next;
        }
        
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;//remove the nth node

    
    return dummy.next;

        // ListNode temp = head;
        // for(int i=0;i<n;i++){
        //     temp = temp.next;
        // }
        // if(temp==null){
        //     return head.next;
        // }
        // ListNode temp2 = head;
        // ListNode pre = null;
        // while(temp!=null){
        //     temp=temp.next;
        //     pre = temp2;
        //     temp2 = temp2.next;
        // }
        // pre.next = pre.next.next;
        // return head;
    }
}
