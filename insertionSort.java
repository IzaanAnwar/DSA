import java.lang.*;
import java.util.*;

class InertionSort {

    public static void main(String args[]) {
        int[] arr = new int[] {3,2,1};
        insertionSort(arr);
        print(arr);
    }

    public static void print(int[] arr) {

        for(int i=0;i<arr.length;i++) {
           System.out.printf("%d, ",arr[i]);
        }
        System.out.println("\n");

    }

    public static void insertionSort(int[] arr) {
        int i=0;
        
        while(i<arr.length) {
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]> temp) {
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = temp;
            i++;

        }
    }

}
