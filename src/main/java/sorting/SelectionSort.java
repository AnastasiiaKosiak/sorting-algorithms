package sorting;
import java.util.Collections;
public class SelectionSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;++i){
            int min = i;
            for(int j=i+1;j<size;++j){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
        swap(arr, min, i);
        }
    }

    public static void main(String[] args){
        int[] array = {-4, 20, 5, 11, 12, 0, -2,56, 3, -11};
        System.out.println("Initial array: ");
        for (int x : array){
            System.out.print(x+ " ");
        }
        System.out.println(" ");
        sort(array);
        System.out.println("Sorted array: ");
        for (int x: array) {
            System.out.print(x + " ");
        }
    }
}
