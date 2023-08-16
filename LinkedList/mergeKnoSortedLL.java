package LinkedList;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        
        }
    }

public class mergeKnoSortedLL {
    
    public static Node head;

    public static Node sortedMerge(Node a,Node b){
        Node result = null;
        //base cases
        if(a==null){
            return b;
        }
        else if(b==null){
            return a;
        }
        //Pick either a or b, and do recursion
        if(a.data<=b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else{
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    //The main func that takes an array of lists arr[0-last] and generates the sorted output.
    public static Node mergeKLists(Node arr[],int last){
        // repeat untiil only one list is left;
        while(last!=0){
            int i=0,j= last;
            //(i,j) forms a pair
            while(i<j){
                //merge list i with List j and store
                 // merged list in LIst i
                arr[i] = sortedMerge(arr[i], arr[j]);
                
                //consider next pair
                i++;
                j--;
                //if all pairs are merged, update last.
                if(i>=j){
                    last = j;
                }

            }
        }
        return arr[0];
    }

    public static void printList(Node head){
        Node  temp  = head ;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        int k = 3; // number of linked list
        int n = 4;  // Number of elements in each list.
        // an array of pointers storing the head nodes
        // of the linked lists
        Node arr[] = new Node[k];
  
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
  
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
  
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
  
        // Merge all lists
        Node head = mergeKLists(arr, k - 1);
        printList(head);
    }
}
