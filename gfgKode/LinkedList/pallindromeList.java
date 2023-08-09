//use stack -> store list data -> traverse list and pop and check if equal






class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        if(head == null)
            return false;
        else {
            Node temp = head;
            Stack<Node> stack = new Stack<Node>();
            while(temp != null){
                stack.push(temp);
                temp = temp.next;
            }
            temp = head;

            while(temp != null){
                if(temp.data != stack.pop().data)
                    return false;
                temp = temp.next;
            }
            return true;
        }
    }
}

