package com.zht.algorithm.dayfive;

import com.zht.algorithm.TreeNode;

import java.util.Stack;

/**
 * author  :zhangtao
 * date    :2019/5/28 11:36
 * desc    :
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if(left == null || right == null){
            return left == null && right == null;
        }
        return left.val == right.val && dfs(left.right,right.left) && dfs(left.left,right.right);
    }



    public boolean isSymmetricTwo(TreeNode root) {
        if(root == null)
            return true;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root.left);
        s2.push(root.right);
        while (!s1.empty() && !s2.empty()){
            TreeNode node1 = s1.pop();
            TreeNode node2 = s2.pop();
            if(node1 == null && node2 == null){
                continue;
            }else if(node1 == null || node2 == null){
                return false;
            }else if(node1.val != node2.val){
                return false;
            }
            s1.push(node1.left);
            s2.push(node2.right);
            s1.push(node1.right);
            s2.push(node2.left);
        }
        return true;
    }
}



