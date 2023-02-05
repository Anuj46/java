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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode gte = new ListNode();
        
        ListNode smallTail = small;
        ListNode gteTail = gte;
        
        while(head != null){
            if(head.val < x){
                smallTail.next = head;
                smallTail = smallTail.next;
            }
            else{
                gteTail.next = head;
                gteTail = gteTail.next;
            }
            head = head.next;
        }
        
        smallTail.next = gte.next;
        gteTail.next = null;
        
        return small.next;
    }
    
}