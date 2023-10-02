package sortingggg;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
int[] arr= {1,2,3,4,5};
bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int [] arr) {
        // run the steps n-1 times
        boolean swapped;
        for(int i=0;i<arr.length-1;i++) {
            // for each step,max item will come at the last respective index
            swapped=false;
            for(int j=1;j<=arr.length-i-1;j++) {
                //swap if the item is smallter
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
// if u did not swap for a particular value of i , it means the array is sorted
            if(!swapped) {break;}
        }
    }

}
