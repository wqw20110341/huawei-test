package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Test94 {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helperHandler(root,result);
        return  result;
    }

    private void helperHandler(TreeNode root, ArrayList<Integer> result) {
        if(root == null){
            return;
        }
        helperHandler(root.left,result);
        result.add(root.val);
        helperHandler(root.right,result);
    }

    public class TreeNode {
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
