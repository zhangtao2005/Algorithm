package com.zht.algorithm.daytwelve;

import com.zht.algorithm.ListNode;

/**
 * author  :zhangtao
 * date    :2019/6/6 15:19
 * desc    :
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addNode = new ListNode(-1);
        ListNode currNode = null;
        int addVal = 0;
        int leftVal = 0;
        while (l1 != null || l2 != null){
            if(l1 == null ){
                leftVal = l2.val + addVal;
                l2 = l2.next;
            }else if(l2 == null ){
                leftVal = l1.val + addVal;
                l1 = l1.next;
            }else{
                leftVal = l1.val + l2.val + addVal;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (leftVal >= 10){
                addVal = 1;
                leftVal -= 10;
            }else {
                addVal = 0;
            }
            ListNode nextNode = new ListNode(leftVal);
            if (currNode != null){
                currNode.next = nextNode;
                currNode = nextNode;
            } else {
                addNode.next = currNode = nextNode;
            }
        }
        if (addVal != 0){
            ListNode nextNode = new ListNode(addVal);
            currNode.next = nextNode;
        }
        return addNode.next;
    }
}
