public class bubbleSort {
    // public static void getBubbleSorted(int arr[]){
        
    //     for(int turn=0;turn<=arr.length-1;turn++){
    //         for(int i=0;i<arr.length-1-turn;i++){
    //             if(arr[i]>arr[i+1]){
    //                 //swap
    //                 int temp = arr[i];
    //                 arr[i] = arr[i+1];
    //                 arr[i+1] = temp;
    //             } 
    //         }
    //     }
    // }


    public static void printSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // In selection sorted we don't swap from the beginning. First we find out the smallest in the whole array 
    //place it accordingly to the index. And we swap the other elements respectively.
    public static void getSelectionSorted(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int minPos = i ;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                   
                }
            }
            // swap the lowest number in the j place.
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }

    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int previous = i-1;
            //finding out the correct position to insert
            while(previous >=0 && arr[previous]>current)
            {
                arr[previous+1] = arr[previous];
                previous--;
            }

            // insertion
            arr[previous+1] = current;

        }
    }
    public static void main(String[] args){
        int arr[] = {5,6,3,2,7};
        insertionSort(arr);
        printSorted(arr);
    }
}
