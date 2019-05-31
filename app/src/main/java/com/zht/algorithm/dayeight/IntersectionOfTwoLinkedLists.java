package com.zht.algorithm.dayeight;

import com.zht.algorithm.ListNode;

import java.util.HashSet;

/**
 * author  :zhangtao
 * date    :2019/5/31 14:13
 * desc    :
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        if(headA == headB){
            return headA;
        }
        ListNode curr = headA;
        int lenA = 0,lenB = 0;
        while (curr != null){
            lenA++;
            curr = curr.next;
        }
        curr = headB;
        while (curr != null){
            lenB++;
            curr = curr.next;
        }
        curr = headA;
        ListNode another = headB;
        if(lenA > lenB){
            while (lenA > lenB){
                curr = curr.next;
                lenA--;
            }
        }else{
            while (lenA < lenB){
                another = another.next;
                lenB--;
            }
        }
        while (curr != another){
            curr = curr.next;
            another = another.next;
        }
        return curr;
    }

    public ListNode getIntersectionNodeTwo(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        if(headA == headB){
            return headA;
        }
        HashSet<ListNode> container = new HashSet<>();
        ListNode node = headA;
        while (node != null){
            container.add(node);
            node = node.next;
        }
        node = headB;
        while (node != null){
            if(!(container.contains(node))){
                node = node.next;
            }else{
                return node;
            }
        }
        return null;
    }
}
