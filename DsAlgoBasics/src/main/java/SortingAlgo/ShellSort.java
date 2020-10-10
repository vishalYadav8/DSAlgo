package SortingAlgo;

import java.util.Arrays;

public class ShellSort {


    public  static  void shellSort(int[] array) {


        for(int gap=array.length/2;gap>0;gap/=2)
        {
         //   int i=gap;
            for(int i=gap;i<array.length;i++)
            {
                int newElement=array[i];
                int j=i;
                while(j>=gap && array[j-gap]>newElement)
                {
                    array[j]=array[j-gap];
                    j-=gap;
                }
                array[j]=newElement;
            }
        }
System.out.println(Arrays.toString(array));
}
public static void main(String[] args)
{
    int[] array=new int[]{22,13,-54,1,-14,43};
    shellSort(array);
}

}
