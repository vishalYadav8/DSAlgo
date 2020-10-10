package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void swap(int[] array,int x,int y)
    {
        int temp;
        if(x==y)
        {
            return ;
        }
        temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }

    public static   int[] bubbleSort(int[] unsortedArray)
    {
        try
        {
            for (int i=unsortedArray.length-1;i>=0;i--)
            {
                for(int y=0;y<i;y++)
                {
                    if(unsortedArray[y]>unsortedArray[y+1])
                    {
                        swap(unsortedArray,y,y+1);
                    }
                    else
                    {
                        continue;
                    }
                }

                System.out.println(unsortedArray);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error"+e);
        }
            return unsortedArray;
    }
     public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arrSize=input.nextInt();
        System.out.println("enter array elements one by one");
        int[] sortArray=new int[arrSize];
        for (int i=0;i<arrSize;i++)
        {
            System.out.println("Enter the "+i+"element");
            sortArray[i]=input.nextInt();
            System.out.println("The value entered is"+sortArray[i]);
        }

        System.out.print(Arrays.toString(bubbleSort(sortArray)));
    }
}
