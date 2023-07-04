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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);

        while(!q.isEmpty()) {
            int levelNum = q.size();
            List<Integer> subList = new LinkedList<>();

            for(int i=0; i<levelNum; i++) {
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                subList.add(q.poll().val);
            }
            ans.add(subList);
        }
        return ans;
       
    }
    private List<Integer> preOrder(TreeNode node, List<Integer> ans) {
        //NLR
        if(node == null) return ans;

        ans.add(node.val);
        preOrder(node.left, ans);
        preOrder(node.right, ans);
        return ans;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ans = preOrder(root, ans);
        return ans;
    }

    private List<Integer> inorder(TreeNode node,List<Integer>ans) {
        if(node == null) return ans;

        inorder(node.left, ans);
        ans.add(node.val);
        inorder(node.right, ans);
        return ans;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

     private List<Integer> postorder(TreeNode node,List<Integer>ans) {
        //LRN
        if(node == null) return ans;

        postorder(node.left, ans);
        postorder(node.right, ans);
        ans.add(node.val);
        
        return ans;
    }
 
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
}
