package com.zht.algorithm.dayfive;

/**
 * author  :zhangtao
 * date    :2019/5/28 16:10
 * desc    :
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return sortedArrayToBSTWithRange(nums,0,nums.length - 1);
    }

    private TreeNode sortedArrayToBSTWithRange(int[] nums, int start, int end) {
        if(start > end ){
            return null;
        }
        int middleIndex = start + (end - start ) / 2;
        TreeNode node = new TreeNode(nums[middleIndex]);

        node.left = sortedArrayToBSTWithRange(nums,start,middleIndex - 1);
        node.right = sortedArrayToBSTWithRange(nums,middleIndex + 1,end);
        return node;
    }
}
