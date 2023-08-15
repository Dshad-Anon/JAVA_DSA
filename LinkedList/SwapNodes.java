package LinkedList;
//QN: We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links.Swapping data of nodes may be expensive in many situations
//when data contains many fields. It may be assumed that all keys in the linked list are distinct.
        
public class SwapNodes {

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

    //Function to swap the Nodes x and y in linked list by changing links.
    public void swapNodes(int x,int y){
        if(x==y){
            return;
        }
        //Search for x( Keep the track of prevX and CurrentX)
        Node prevX = null;
        Node CurrX = head;
        while(CurrX !=null&& CurrX.data!=x){
            prevX = CurrX;
            CurrX = CurrX.next;
        }
        // search for y(Keep the track of prevY and CurrentY)
        Node prevY = null;
        Node CurrY = head;
        while(CurrY!=null && CurrY.data!=y){
            prevY = CurrY;
            CurrY = CurrY.next;
        }
        // IF either x or y is not present, we can do nothing.
        if(CurrX == null || CurrY==null){
            return;
        }
        //IF x is not the head of the linked list.
        if(prevX!=null){
            prevX.next = CurrY;
        }else{
            // make y the new head;
            head = CurrY;
        }

        // If y is not the head of the linked list.
        if(prevY!=null){
            prevY.next = CurrX;
        }else{
            // The head will be new.
            head = CurrX;
        }

        // SWAP NEXT POINTERS.  
        Node temp = CurrX.next;
        CurrX.next = CurrY.next;
        CurrY.next = temp;
    }

    //push newData in the node addFirst.
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head =  newNode;
    } 

        //Helper funct to print the contents of LL.
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        SwapNodes ll = new SwapNodes();
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        ll.print();
        ll.swapNodes(2, 4);
        ll.print();

            
            
        }
    
     }
    
