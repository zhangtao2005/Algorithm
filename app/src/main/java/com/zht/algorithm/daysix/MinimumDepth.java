package com.zht.algorithm.daysix;

import com.zht.algorithm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * author  :zhangtao
 * date    :2019/5/29 11:23
 * desc    :
 */
public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return level;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return level;
    }

    public int minDepthTwo(TreeNode root) {
        if(root == null)
            return 0;
       if(root.left == null && root.right == null)
           return 1;
       int leftDepth = minDepth(root.left);
       int rightDepth = minDepth(root.right);
       if(root.left == null || root.right == null)
           return root.left == null ? rightDepth + 1:leftDepth + 1;
        return Math.min(leftDepth,rightDepth)+1;
    }


}
