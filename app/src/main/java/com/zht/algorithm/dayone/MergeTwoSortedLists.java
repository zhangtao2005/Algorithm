package com.zht.algorithm.dayone;

/**
 * author  :zhangtao
 * date    :2019/5/22 18:10
 * desc    :
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1 == null || l2 == null){
           return l1 == null? l2:l1;
       }
       ListNode head = new ListNode(0);
       ListNode node = head;
       while (l1 != null && l2 != null){
           if(l1.val < l2.val){
               node.next = l1;
               l1 = l1.next;
           }else{
               node.next = l2;
               l2 = l2.next;
           }
           node = node.next;
       }

       if(l1 != null){
           node.next = l1;
       }else if(l2 != null) {
           node.next = l2;
       }
        return head.next;
    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
