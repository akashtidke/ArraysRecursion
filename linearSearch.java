public class linearSearch {
    public static void main(String[] args) {
       int[]arr={3,1,16,4};
int target=16;
 int index=0;
        System.out.println(fn(arr,target,index));
    }
    static boolean fn(int []arr,int target,int index){

        if (arr.length==index){
          return   false;
        }

return arr[index]==target ||fn(arr,target,index+1);
    }
}
