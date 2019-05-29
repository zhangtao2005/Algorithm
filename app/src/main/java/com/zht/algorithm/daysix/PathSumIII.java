package com.zht.algorithm.daysix;

import com.zht.algorithm.TreeNode;

/**
 * author  :zhangtao
 * date    :2019/5/29 15:59
 * desc    :
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return dfs(root,sum) + pathSum(root.left,sum ) +
                pathSum(root.right,sum);
    }

    private int dfs(TreeNode node, int sum) {
        int num = 0;
        if (node == null)
            return num;
        num += node.val == sum ? 1 : 0;
        num += dfs(node.left,sum - node.val);
        num += dfs(node.right,sum - node.val);
        return num;
    }
}
