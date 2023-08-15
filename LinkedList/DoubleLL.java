package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //Add first .
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //Add last.
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode; 
        tail = newNode;
        
        
    }
    //print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    //remove first.
    public int removeFirst(){
        if(head==null){
            System.err.println("Dll is empty");
            return Integer.MIN_VALUE;
        } 
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
       }

    //remove last
    public int removeLast(){
        if(head==null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = tail.data;
            head= tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.print();
       // System.out.println(dll.size);
        dll.reverse();
        dll.print();
        //System.out.println(dll.size);
          
    } 
}
