package LinkedList;
 
public class DetectList {

    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Floyd's cycle finding alg.
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;  // jumps 1 step
            fast = fast.next.next; // 2 step
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Remove a cycle from the LL.
    public static void removeCycle(){
        //detect cycle
        Node slow = head ;
        Node fast = head; 
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //Find meeting point
        Node prev = null;
        slow = head;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        // remove cycle-> last.next = null
        prev.next = null;
    }
    public static void main(String args[]){
        //LinkedList ll = new LinkedList();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
    
}
