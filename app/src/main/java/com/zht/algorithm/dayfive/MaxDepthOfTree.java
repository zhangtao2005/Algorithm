package com.zht.algorithm.dayfive;

/**
 * author  :zhangtao
 * date    :2019/5/28 14:30
 * desc    :
 */
public class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.right == null && root.left == null){
            return 1;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

}
