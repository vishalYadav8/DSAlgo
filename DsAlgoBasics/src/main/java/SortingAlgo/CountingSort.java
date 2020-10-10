package SortingAlgo;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] ar,int max,int min)
    {
        int[] countingArr=new int[max-min+1];
        for(int element:ar)
        {
            countingArr[element-min]++;
        }
        int index=min;
        int j=0;
        for (int i=0;i<countingArr.length;i++)
        {

           if(countingArr[i]>0)
           {
               while(countingArr[i]>0)
               {
                   ar[j]=index;
                   countingArr[i]--;
                   j++;
               }
           }
            index++;
        }
System.out.println(Arrays.toString(ar));

    }

    public static void main(String[] args)
    {
        int[] arr=new int[]{2,5,3,2,4,10,8,4,9};
        countingSort(arr,10,2);
    }


}
