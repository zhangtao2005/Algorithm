package com.zht.algorithm.dayseven;

import com.zht.algorithm.ListNode;

/**
 * author  :zhangtao
 * date    :2019/5/30 17:01
 * desc    :指针，每次走1，和每次走2，看是否相遇
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode next = head.next;
        ListNode nextOfNext;
        if(next == null)
            return false;
        if(next.next != null){
            nextOfNext = next.next;
        }else{
            return false;
        }
        while (next != null){
            if(nextOfNext == null)
                return false;
            if(next == nextOfNext){
                return true;
            }
            if (nextOfNext != null && nextOfNext.next != null){
                nextOfNext = nextOfNext.next.next;
            }else{
                return false;
            }
            next = next.next;
        }

        return false;
    }
}
