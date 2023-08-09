class GfG
{
    Node deleteNode(Node head, int x)
    {
    // Your code here
        
        Node temp = head;
        if(x==1){
            head= temp.next;
            temp.next=null;
            return head;
        }
        Node prev = head;
        int count = 1;
        while(temp!=null){
            if(count == x &&  temp.next !=null){
                prev.next = temp.next;
            }else if(count == x &&  temp.next ==null){
                prev.next=null;
            }
            prev=temp;
            temp =temp.next;
            count++;
        }
        return head;
    }
}
