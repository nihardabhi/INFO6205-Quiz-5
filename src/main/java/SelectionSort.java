class SelectionSort {
    public static void selectionSort(int[] arr) {
        //copy your length of the array so we can iterate in for loop
        int n = arr.length;

        //start to iterate over here
        for (int i = 0; i < n - 1; i++) {
            //first let us just assuming that first index element is the smallest of all
            int minIndex = i;

            //from the very next index let's find the potential smallest element if any
            for (int j = i + 1; j < n; j++) {
                //if we can find smallest element exchange that value
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap occurs over here
            //store smallest element in temp for a while
            int temp = arr[minIndex];
            //place assumed first sorted element which is not the smallest now, into where we find the smallest elements
            arr[minIndex] = arr[i];
            //let's place smallest number into ascending order one by one
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   