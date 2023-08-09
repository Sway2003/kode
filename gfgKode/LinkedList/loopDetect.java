class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        Node start = head;
        
        // Detect the loop using Floyd's cycle detection algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        
        // If there is no loop in the linked list, return
        if (slow != fast) {
            return;
        }
        
        // Move 'start' to the beginning of the linked list
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
        
        // Find the last node of the loop and set its 'next' to null to remove the loop
        while (slow.next != start) {
            slow = slow.next;
        }
        slow.next = null;
    }
}
