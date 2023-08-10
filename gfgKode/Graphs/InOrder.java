class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    void inorder(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
            
        }
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans=new ArrayList<Integer>();
        inorder(root,ans);
        return ans;
        
        
    }
}
