package com.zht.algorithm.dayeight;

import java.util.Stack;

/**
 * author  :zhangtao
 * date    :2019/5/31 10:46
 * desc    :
 */
public class MinStack {
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    /** initialize your data structure here. */

    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

//    Stack<Integer> stack;
//    Stack<Integer> stackMin;
//    public MinStack() {
//        stack = new Stack<>();
//        stackMin = new Stack<>();
//    }
//
//    public void push(int x) {
//        stack.push(x);
//        if(stackMin.isEmpty()){
//            stackMin.push(x);
//        }else{
//            stackMin.push(stackMin.peek() > x ? x:stackMin.peek());
//        }
//    }
//
//    public void pop() {
//        stackMin.pop();
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return stackMin.peek();
//    }
}
