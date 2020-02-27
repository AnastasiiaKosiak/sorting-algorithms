package sorting;

public class BubbleSort {
    static void sort(int[] array){
        int size = array.length;
        int tmp = 0;
        for(int i=0; i<size;++i){
            for(int j=1;j<size;++j){
                if(array[j-1]>array[j]){
                    tmp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=tmp;
                }
            }
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
