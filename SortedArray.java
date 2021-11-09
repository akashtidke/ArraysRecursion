public class SortedArray {
    public static void main(String[] args) {
        int []arr={1,2,2,5,7};
        int index=0;
        System.out.println(fn(arr,index));
    }
    static boolean fn(int[]arr,int index){
if (index==arr.length-1){
    return true;
}


        return arr[index]<=arr[index+1]&&fn(arr,index+1);
    }
}
