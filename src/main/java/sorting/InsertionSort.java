package sorting;

public class InsertionSort {
    static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] array = {-4, 20, 5, 11, 12, 0, -2, 56, 3, -11};
        System.out.println("Initial array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        sort(array);
        System.out.println("Sorted array: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
