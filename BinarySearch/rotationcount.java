public class rotationcount {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        int pivotIdx=getPivotIdx(arr);
        System.out.println(pivotIdx+1);
    }

    static int getPivotIdx(int arr[]){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;

            if(arr[m]>arr[m+1])
            return m;
            else if(arr[m]<arr[m-1])
            return m-1;
            else if(arr[s]<arr[m]){
                s=m+1;
            }
            else
            e=m-1;
        }

        return -1;
    }
}
