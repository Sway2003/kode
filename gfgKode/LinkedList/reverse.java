//this is bruteforce approach i still think using stack to reverse elements is much efficient and easier




Node reverseList(Node head)
    {
        // code here
        Node curr = head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
