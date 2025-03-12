class M236 {
    
    public M236(){};

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
       if(root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if (left != null && right != null){
                return root;
            }    
            
        return  left != null ? left : right; 
    }

    public static void main(String[] args) {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        

        // Test with nodes p = 5 and q = 1
        M236 solution = new M236();
        TreeNode p = root.left.left;  // Node 6
        TreeNode q = root.left.right; // Node 2
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 6 and 2: " + lca.val); // Should print 3
    }
}