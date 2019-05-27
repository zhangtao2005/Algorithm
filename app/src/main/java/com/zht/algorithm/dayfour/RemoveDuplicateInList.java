package com.zht.algorithm.dayfour;

/**
 * author  :zhangtao
 * date    :2019/5/27 17:32
 * desc    :
 */
public class RemoveDuplicateInList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode temp = head;
        ListNode node = head.next;
        while (node != null){
            if(temp.val == node.val ){
                if(node.next != null) {
                    temp.next = node.next;
                    node = node.next;
                }else{
                    temp.next = null;
                    node = null;
                }
            }else{
                temp = node;
                node = node.next;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
