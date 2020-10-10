package SortingAlgo.Practice1;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr)
    {
        int unsortedIndex=arr.length-1;
        int largestElementIndex;
        while(unsortedIndex>0)
        {
             largestElementIndex=0;
            for (int i=0;i<=unsortedIndex;i++)
            {
                if (arr[i]>arr[largestElementIndex])
                {
                    largestElementIndex=i;
                }
            }

            int temp=arr[unsortedIndex];
            arr[unsortedIndex]=arr[largestElementIndex];
            arr[largestElementIndex]=temp;
            unsortedIndex--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public  static void main(String[] args)
    {
        int[] array=new int[]{20,35,-15,1,7,55,88};
        selectionSort(array);
    }
}
