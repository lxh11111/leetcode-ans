/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        //TreeNode p=root;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            int maxx=Integer.MIN_VALUE;
            while(len-->0){
                TreeNode temp=queue.poll();
                if(temp.val>maxx) maxx=temp.val;
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            list.add(maxx);
        }
        return list;
    }
}