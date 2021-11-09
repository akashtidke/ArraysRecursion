import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        fn(arr,0);

    }
    static void  fn(int []arr,int index){
       if (arr.length==index){
return;
      }

        System.out.println(arr[index]);
       fn(arr,index+1);

    }
}
