package com.zht.algorithm.dayeleven;

import com.zht.algorithm.ListNode;

/**
 * author  :zhangtao
 * date    :2019/6/5 17:15
 * desc    :
 */
public class RemoveLinkedListsElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node = dummy;
        while (head != null ) {
            if(head.val == val) {
                node.next = head.next;
            }else{
                node = node.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
