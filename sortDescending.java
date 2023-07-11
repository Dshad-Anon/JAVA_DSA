public class sortDescending {

    public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-2;turn++){
            
            // How many times in a turn a swap works. For that I will start with 2nd element at 1 index and compare it with i-1 i.e. for 1. For 2 it will be 1. And if 
            // any of them is smaller smaller goes back.
            for(int i=1;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i-1]){   // so here we just swap the cases to make it in descending order.
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
    }
    public static void printSortedOne(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
        System.err.println();
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        BubbleSort(arr);
        printSortedOne(arr);
    }
}
