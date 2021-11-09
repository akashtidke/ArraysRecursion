public class LastIndex {
    public static void main(String[] args) {
        int []arr={10,43,13,45,10,2};
        int index=arr.length-1;
        int x=10;
        int ans=fn(arr,index,x);
        System.out.println(ans);
    }
    static int fn(int []arr,int index,int x){
        if (arr.length==0){
            return -1;
        }
        if (arr[index]==x){
            return index;
        }
        return fn(arr,index-1,x);
    }
}
