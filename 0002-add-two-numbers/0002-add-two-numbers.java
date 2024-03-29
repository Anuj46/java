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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(); 
        ListNode temp = ans;  
        int carry = 0;
        while(list1!=null || list2!=null || carry != 0){ 
            int sum=0;
            if(list1!=null){
                sum+=list1.val;
                list1 = list1.next;
            }
            if(list2!=null){
                sum+=list2.val;
                list2 = list2.next;
            }
            sum= sum + carry;  
            carry=sum/10;  

            ListNode ll = new ListNode(sum%10);  
            temp.next = ll;  
            temp = temp.next;  
        }
        return ans.next; 
    }
    
}