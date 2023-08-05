public class FindPeakInMountainArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3};

        System.out.println(findPeakIdx(arr));
    }
    static int findPeakIdx(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

}
