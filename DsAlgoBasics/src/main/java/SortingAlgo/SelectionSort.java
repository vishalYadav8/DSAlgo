package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    int[] array;

    SelectionSort(int[] arr) {
        this.array = arr;
    }

    private void swap(int largeIndex, int lastIndex) {
        try {
            if(largeIndex==lastIndex)
            {
                return;
            }
            int temp = array[lastIndex];
            array[lastIndex] = array[largeIndex];
            array[largeIndex] = temp;
        } catch (Exception e) {
            System.out.println("exce" + e);
        }
    }

    private void selectionSort() {
        int largestIndex = 0;
        int newLength = array.length - 1;
        while (newLength > 0) {


       /* for(int newLength=array.length-1;newLength>0;newLength--)
        {*/

            for (int i = 1; i <=newLength; i++) {
                if (array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(largestIndex, newLength);
            newLength--;
            largestIndex=0;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of string");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter the no");
            arr[i] = in.nextInt();
        }
        System.out.println(System.currentTimeMillis());
        SelectionSort sobj = new SelectionSort(arr);
        sobj.selectionSort();
        System.out.println(Arrays.toString(sobj.array));
        System.out.println(System.currentTimeMillis());
    }
}
