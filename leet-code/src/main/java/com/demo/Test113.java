package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Test113 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        pathSum(root,9);
    }


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
          List<List<Integer>> result =  new ArrayList<>();
          if( root == null){
              return  result;
          }
        ArrayList<Integer> list = new ArrayList<>();
        helperHandler(root , result , targetSum , list);
        return result;
    }

    private static void helperHandler(TreeNode root, List<List<Integer>> result, int targetSum, ArrayList<Integer> list) {
        list.add(root.val);
        if( root.left == null && root.right == null  ){
            if(targetSum - root.val == 0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        if(root.left != null ){
            helperHandler(root.left,result,targetSum- root.val , list);
            list.remove(list.size()-1);
        }

        if(root.right != null ){
            helperHandler(root.right,result,targetSum- root.val , list);
            list.remove(list.size()-1);
        }
    }

    private static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

}
