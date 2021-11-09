public class reverseAnArray {
    public static void main(String[] args) {
        int []arr={4,5,6,321};
        fn(arr,0);
    }
    static void fn(int []arr,int index){

        if (arr.length==index){
            return;
        }
        fn(arr,index+1);
        System.out.println(arr[index]);
    }
}
