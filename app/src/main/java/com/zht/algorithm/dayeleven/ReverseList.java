package com.zht.algorithm.dayeleven;

import com.zht.algorithm.ListNode;

/**
 * author  :zhangtao
 * date    :2019/6/5 22:27
 * desc    :
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        while (head != null){
            ListNode temp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = temp;
        }
        return dummy.next;
    }
}
