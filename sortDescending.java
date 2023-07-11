public class sortDescending {

    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 2; turn++) {

            // How many times in a turn a swap works. For that I will start with 2nd element
            // at 1 index and compare it with i-1 i.e. for 1. For 2 it will be 1. And if
            // any of them is smaller smaller goes back.
            for (int i = 1; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i - 1]) { // so here we just swap the cases to make it in descending order.
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }

    public static void printSortedOne(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.err.println();
    }

    // Selection sort. Here we will not do swap at each element but here we will
    // just start taking smallest and put it in the first one. After that take
    // another smallest and put in the left.
    public static void getDescendingSelectedSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_pos] < arr[j]) { // If the indexing one is smaller then we will put the index equivalent to
                                             // the j. IN 5 4 1 2. In index 0 i.e.
                    min_pos = j;
                }
            }
            // position index is found now swapping.
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }

    }

    // Insertion sort. We will pick an element from unsorted part and place it in
    // the right position in sorted part.
    public static void getInsertionSort(int arr[]) {
        // Simple logic is that first fine out the correct position where to insert and
        // then insert it.
        for (int i = 1; i < arr.length; i++) {
            int current_position = arr[i];
            int prev = i - 1;
            // Where is the position
            while (prev >= 0 && arr[prev] < current_position) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = current_position;
        }
    }

    //Counting sort descending.
    public static void countingSortDescending(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
        largest=Math.max(largest,arr[i]);
        }
        // HEre we create a count array which takes the frequency of the total numbers.
        int count[] =new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            }
        int j=0;
        for(int i=count.length-1;i>=0;i--) {
        while(count[i] >0) {
            arr[j] =i;
            j++;
            count[i]--;
            }}}

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingSortDescending(arr);
        printSortedOne(arr);
    }
}
