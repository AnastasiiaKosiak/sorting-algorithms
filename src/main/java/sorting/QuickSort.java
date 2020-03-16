package sorting;

public class QuickSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] array, int l, int h) {
        int pivot = array[h];
        int index = l - 1;
        for (int j = l; j < h; ++j) {
            if (array[j] < pivot) {
                ++index;
                swap(array, index, j);
            }
        }
        swap(array, index + 1, h);

        return index + 1;
    }

    static void sort(int[] array, int l, int h){
        if(l<h){
            int pivot = partition(array, l, h);
            sort(array, l, pivot-1);
            sort(array, pivot+1, h);
        }
    }

    public static void main(String[] args){
        int[] array = {-4, 20, 5, 11, 12, 0, -2,56, 3, -11};
        System.out.println("Initial array: ");
        for (int x : array){
            System.out.print(x+ " ");
        }
        System.out.println(" ");
        sort(array, 0, array.length-1);
        System.out.println("Sorted array: ");
        for (int x: array) {
            System.out.print(x + " ");
        }
    }
}
