package 練習;

import java.util.Arrays;

public class Sort {
    public void run() {
        int[] arr = {11,2,5,7,9,12,10,8};
        //int min=Integer.MAX_VALUE;
        /*for(int i=0;i<arr;i++) {
            if(min>arr[i]) {
                
            }
        }
        */
        Arrays.sort(arr);
        for(int i : arr) 
            System.out.println(i);
    }
}
