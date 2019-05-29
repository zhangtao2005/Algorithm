package com.zht.algorithm.dayfive;

import com.zht.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author  :zhangtao
 * date    :2019/5/28 15:06
 * desc    :
 */
public class BinaryTreeTraversalTwo {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> data = new ArrayList<>();
        if(root == null)
            return data;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> levelData = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelData.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            data.add(0,levelData);
        }
        return data;
    }

}
