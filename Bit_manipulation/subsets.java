public class subsets {
    public static void main(String[] args) {
        int arr[]={1,2,3};

        for(int i=0;i<(1<<arr.length);i++){
            System.out.print("[");
            for(int j=0;j<arr.length;j++){
                
                if(((i>>j) & 1)==1){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
