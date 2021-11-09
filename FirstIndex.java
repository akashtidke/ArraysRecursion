public class FirstIndex {
    public static void main(String[] args) {
        int[]arr={4,5,32,56,32};
        int index=0;
        int x=32;
       int ans= fi(arr,index,x);
        System.out.println(ans);
    }
    static int fi(int []arr,int index,int x){
        if (arr.length==index){
            return -1;
        }
        if (arr[index]==x){
            return index;
        }
       return fi(arr,index+1,x);

    }
}
