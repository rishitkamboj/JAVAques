package cyclicsortquestions;

import java.util.ArrayList;
import java.util.List;

public class googledisapperinggg {

   public List<Integer> disappear(int [] arr) {
        int i=0;
        while(i<arr.length) {
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }else {i++;}
        }
        //just find missing number
      List <Integer> ans = new ArrayList<>();
       for (int index = 0; index < arr.length ; index++) {
           if(arr[index]!=index+1) {
               ans.add(index+1);
           }
       } return ans;
    }

     void swap(int [] arr,int num1,int num2) {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;}


}
