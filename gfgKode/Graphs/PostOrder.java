class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> list = new ArrayList<>();
       if(root == null)
       {
           return list;
       }
       list.addAll(postOrder(root.left));
       list.addAll(postOrder(root.right));
       list.add(root.data);
       return list;
    }
     
}
