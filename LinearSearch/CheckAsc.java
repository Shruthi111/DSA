public class CheckAsc {
    public static void main(String[] args) {
        int arr[]={1, 40, 6, 8, 9};

        System.out.println(checkAsc(arr));
    }
    static boolean checkAsc(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
}
