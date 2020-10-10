package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {

    int[] array;

    InsertionSort(int[] arr) {
        this.array = arr;
    }

    private void insertionSort() {
        int unsortedIndex;
        for (unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int temp;
            int tempunsortedindex = unsortedIndex;
            int j = tempunsortedindex - 1;
            while (j >= 0) {
                if (array[tempunsortedindex] < array[j]) {
                    temp = array[j];
                    array[j] = array[tempunsortedindex];
                    array[tempunsortedindex] = temp;

                } else {
                    break;
                }
                tempunsortedindex--;
                j--;
            }
        }
    }
    public static void main (String[]args)
    {
        int[] a=new int[]{23,-12,44,1,6,-44};
       InsertionSort sort =new InsertionSort(a);
       sort.insertionSort();
       System.out.println(Arrays.toString(sort.array));
    }
}

