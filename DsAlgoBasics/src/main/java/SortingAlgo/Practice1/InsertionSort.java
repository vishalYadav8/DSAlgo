package SortingAlgo.Practice1;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr)
    {
        for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++)
        {
           int element=arr[firstUnsortedIndex];
            int i;
           for( i=firstUnsortedIndex;i>0 && arr[i-1]>element;i--)
           {
               arr[i]=arr[i-1];
           }
            arr[i]=element;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static  void main(String[] args)
    {
        int[] a=new int[]{20,15,-20,65,58,-24};
        insertionSort(a);
    }
}
