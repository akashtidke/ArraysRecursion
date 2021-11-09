import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []arr={5,64,2,5};
        System.out.println(max(arr,0));
    }
    static int max(int arr[],int index){
if (arr.length-1==index){
    return arr[index];
}

int maxno=max(arr,index+1);
if (arr[index]>maxno){
    maxno=arr[index];
}
return maxno;
    }
}
