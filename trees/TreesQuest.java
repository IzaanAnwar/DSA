class Solution {
    //height of a tree
    private int maxDepth(TreeNode root) {
        
        if(root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int ans = Math.max(left, right) + 1;
        return ans;
    }
    // diameter of tree using height
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int h = maxDepth(root.left) + maxDepth(root.right);

        int ans = Math.max(leftD, Math.max( rightD, h));
        return ans;
    }

    class Pair {
        int first;
        int second;
        public Pair() {}
        public Pair (int f, int s) {
            this.first = f;
            this.second = s;
        }
    }
    private Pair diameterOfBinaryTreeFast(TreeNode root) {
        
        if(root == null) {
            Pair pair = new Pair(0,0);
            return pair;
        }
        
        Pair left = diameterOfBinaryTreeFast(root.left);
        Pair right = diameterOfBinaryTreeFast(root.right);
        
        int op1 = left.first;
        int op2 = right.first;
        int op3 = left.second + right.second ;

        Pair ans = new Pair();
        ans.first = Math.max(op1, Math.max( op2, op3));
        ans.second = Math.max(left.second, right.second) +1;
        return ans;
    }
}

class SecondSOl{

    int maxi = 0;
    private int solve(TreeNode root) {
        if(root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        maxi = Math.max(maxi, (left+ right));
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return maxi;
    }
}
