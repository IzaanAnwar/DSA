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
    class Pair {
        boolean first;
        int second;
        public Pair() {}
        public Pair (boolean b, int s) {
            this.first = b;
            this.second = s;
        }
    }
    private Pair solve(TreeNode node) {
        if(node == null) {
            Pair p = new Pair(true, 0);
            return p;
        }

        Pair lt = solve(node.left);
        Pair rt = solve(node.right);

        boolean diff = Math.abs(lt.second - rt.second) <= 1 ? true : false;

        Pair ans = new Pair();
        ans.second = Math.max(lt.second, rt.second) + 1;
        if(lt.first && rt.first && diff) {
            ans.first = true;
            
        } else {
             ans.first = false;
        }
        return ans;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return solve(root).first;
    }
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
       

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        boolean isValSame = p.val == q.val ? true: false;

        if(left && right && isValSame) return true;
        else return false;
    }
}
