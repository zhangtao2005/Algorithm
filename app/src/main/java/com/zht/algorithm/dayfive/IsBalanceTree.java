package com.zht.algorithm.dayfive;

import com.zht.algorithm.TreeNode;

/**
 * author  :zhangtao
 * date    :2019/5/28 17:38
 * desc    :
 */
public class IsBalanceTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return balance(root);
    }

    private boolean balance(TreeNode node) {
        boolean isBalance ;
        while (node != null){
            isBalance =  Math.abs(depth(node.right) - depth(node.left)) <= 1;
            if(!isBalance){
                return false;
            }
           return balance(node.left) && balance(node.right);
        }
        return true;
    }

    public int depth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.right == null && root.left == null){
            return 1;
        }
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
