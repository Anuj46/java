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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode ansNode=ans;
    while(l1 !=null && l2 !=null){
    if(l1.val<l2.val){
        ansNode.next=l1;
        l1=l1.next;
    }
    else{
        ansNode.next=l2;
        l2=l2.next;
    }
    ansNode=ansNode.next;
    }
    if(l1!=null){
    ansNode.next=l1;
    
    }
    if(l2!=null){
    ansNode.next=l2;
    }
return ans.next;
}
}