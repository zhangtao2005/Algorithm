package com.zht.algorithm.daysix;

import com.zht.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * author  :zhangtao
 * date    :2019/5/29 14:56
 * desc    :
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> datas = new ArrayList<>();
        if (root == null)
            return datas;
        dfs(datas,new ArrayList<Integer>(),root,sum);
        return datas;
    }

    private void dfs(ArrayList<List<Integer>> datas, List<Integer> list, TreeNode node, int sum) {
        if (node == null){
            return;
        }
        list.add(node.val);
        if(node.left == null && node.right == null){
            if(node.val == sum){
                datas.add(new ArrayList<Integer>(list));//新建ArrayList，将当前list数据全部拷贝
            }
            return;
        }
        if(node.left != null){
            dfs(datas,list,node.left,sum - node.val);
            list.remove(list.size() - 1);
        }
        if(node.right != null){
            dfs(datas,list,node.right,sum - node.val);
            list.remove(list.size() - 1);
        }
    }
}
