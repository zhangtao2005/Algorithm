package com.zht.algorithm.daysix;

import com.zht.algorithm.TreeNode;

/**
 * author  :zhangtao
 * date    :2019/5/29 13:44
 * desc    :
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum == root.val){
            return true;
        }
        return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
    }
}
