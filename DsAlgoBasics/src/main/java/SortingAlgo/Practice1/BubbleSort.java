package SortingAlgo.Practice1;

import java.util.Arrays;

/*
This class will be a attempt to implement bubble sort
Bubble Sort is one of the basic sorting technique with time complexity of O(n^2)-quadratic
in this sort,we traverse through the array again and again until array is sorted.
starting from left of array,we will compare every element to each other and swap accordingly.
 @author-Vishal*/
public class BubbleSort {

    public static void main(String[] args)
    {
        int[] unsortedArray=new int[]{20,35,-15,1,7,55,88};
        bubbleSort(unsortedArray);
    }

    static void bubbleSort(int[] unsArray) {
        int a = unsArray.length-1;
        while (a > 0)
        {
            for (int i = 0; i <a;i++)
            {
                if(unsArray[i]>unsArray[i+1])
                {
                  int temp=unsArray[i];
                  unsArray[i]=unsArray[i+1];
                  unsArray[i+1]=temp;
                }
            }
            a--;
        }
        System.out.println(Arrays.toString(unsArray));
    }
}
