import java.util.*;

public class SelectionSort {

    public static void main(String[]args){

        int[]arr={1,3,2,7,0,6,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr) {
            System.out.print(i);
        }
    }
}
