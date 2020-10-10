
package SortingAlgo.Practice1;
public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{20, 35, -15, 1, 7, 55, -24};
mergeSort(array,0,array.length);
    }

    static void mergeSort(int[] array, int start, int end) {
        if (end-start < 2) {
            return;
        }
        int mid = (end+start)/ 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    static void merge(int[] ar, int start, int mid, int end) {

        if (ar[mid - 1] >= ar[mid]) {
            return;
        }
        int[] temp = new int[end - start];
        int tempindex = 0;
        int i = start, j = mid;
        while (i < mid && j < end) {
            temp[tempindex++] = ar[i] >= ar[j] ? ar[i++] : ar[j++];
        }
        System.arraycopy(ar, i, ar, start + tempindex, mid - i);
        System.arraycopy(temp, 0, ar, start, tempindex);


    }

}