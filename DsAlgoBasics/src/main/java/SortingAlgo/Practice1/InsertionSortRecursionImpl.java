package SortingAlgo.Practice1;

import java.util.Arrays;

public class InsertionSortRecursionImpl {

    public static void main(String[] args)
    {
        int[] a=new int[]{20,35,-15,1,7,55,-15};
        insertionSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    static void insertionSort(int[] array)
    {
        for (int unsortedIndex=1;unsortedIndex<array.length;unsortedIndex++)
        {
            int element= array[unsortedIndex];
            int j;
            for (j=unsortedIndex ;j>0 && array[j-1]>element;j--)
            {
                array[j]=array[j-1];
            }
            array[j]=element;
        }
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array,int numItems)
    {
        if (numItems<2)
        {
            return;
        }
        insertionSort(array,numItems-1);
        int element=array[numItems-1];
        int i;
        for (i=numItems-1;i>0 && array[i-1]>element;i--)
        {
            array[i]=array[i-1];
        }
        array[i]=element;

    }

}
