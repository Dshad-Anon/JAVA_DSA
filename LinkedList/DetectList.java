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
    public static void main(String args[]){
        //LinkedList ll = new LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        //head.next.next.next = head;
        System.out.println(isCycle());
    }
    
}
