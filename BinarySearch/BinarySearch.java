public class BinarySearch{
    public static void main(String[] args) {
        int arr[]={1000,230,56,7,1};
        int target=7;
        System.out.println(getIndex(arr,target));
    }
    static int getIndex(int arr[],int target){

        // Order agnostic Binary search:
        int start=0;
        int end=arr.length-1;
        boolean isAsc=false;

        if(arr[start]<arr[end]){
            isAsc=true;
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            return mid;
            if(isAsc){
            if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
            }
            else{
            if(arr[mid]>target)
            start=mid+1;
            else
            end=mid-1;
            }
        }
        return -1;
    }
}