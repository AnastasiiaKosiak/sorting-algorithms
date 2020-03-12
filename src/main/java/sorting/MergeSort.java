package sorting;

public class MergeSort {
    static void merge(int[] arr, int left, int mid, int right){
        int s1 = mid-left+1;
        int s2 = right-mid;

        int[] leftArray = new int[s1];
        int[] rightArray = new int[s2];

       for (int i=0; i<s1; ++i) {
           leftArray[i] = arr[left + i];
       }

        for (int j=0; j<s2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i=0, j=0;
        int k = left;

        while(i<s1&&j<s2) {
           if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                ++i;
            } else {
                arr[k] = rightArray[j];
                ++j;
            }
            k++;
        }
        while (i < s1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < s2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

   static void sort(int[] arr, int left, int right){
        if (left < right) {
            // Find the middle point
            int mid = (left+right)/2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr , mid+1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args){
        int[] array = {-4, 20, 5, 11, 12, 0, -2,56, 3, -11};
        System.out.println("Initial array: ");
        for (int x : array){
            System.out.print(x+ " ");
        }
        System.out.println(" ");
        sort(array, 0,array.length-1);
        System.out.println("Sorted array: ");
        for (int x: array) {
            System.out.print(x + " ");
        }
    }
}
