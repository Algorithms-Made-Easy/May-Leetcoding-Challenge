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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode currentOdd=head;
        ListNode evenHead=head.next;
        ListNode currentEven=currentOdd.next;
        while(currentOdd!=null && currentEven!=null){
            if(currentOdd.next==currentEven){
                currentOdd.next=currentEven.next;
                if(currentOdd.next!=null){
                    currentOdd=currentOdd.next;
                }
            }
            else{
                currentEven.next=currentOdd.next;
                currentEven=currentEven.next;
            }
        }
        
        currentOdd.next=evenHead;
        
        return head;
    }
}