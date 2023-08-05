public class FirstMissingPositiveNo {
    public static void main(String[] args) {
        int arr[]={-1,1,3,4};

        System.out.println(findSmallestMissingPositiveNo(arr));
    }
    static int findSmallestMissingPositiveNo(int arr[]){
        int i=0;
        while(i<arr.length){
            int crtIdx=arr[i];

            if(arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[crtIdx]){
                int temp=arr[i];
                arr[i]=arr[crtIdx];
                arr[crtIdx]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=j)
            return j;
        }
        return arr.length;
    }
}
