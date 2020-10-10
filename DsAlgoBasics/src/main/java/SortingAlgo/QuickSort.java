package SortingAlgo;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] ar,int start,int end)
    {
        if(end-start<2)
        {
            return;
        }
        int pivotIndex=sort(ar,start,end);
        quickSort(ar,start,pivotIndex);
        quickSort(ar,pivotIndex+1,end);
        System.out.println(Arrays.toString(ar));
    }
    public static int sort(int[] ar,int i,int j)
    {
        int pivot=ar[i];
        while(i<j)
        {
            while(i<j && pivot<=ar[--j] );
            if(i<j)
            {
                ar[i]=ar[j];
            }

            while(i<j && ar[++i]<=pivot);
                if(i<j)
                {
                    ar[j]=ar[i];
                }

        }
        ar[j]=pivot;
        return j;

    }



    public static void main (String[] args)
    {
        int[] ar=new int[]{20,35,-15,7,55,1,-22};
        quickSort(ar,0,ar.length);

    }



}
