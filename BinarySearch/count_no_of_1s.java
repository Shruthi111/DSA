// Count no of ones in binary sorted array

public class count_no_of_1s {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,1};

        int firstOcc=getFirstIndex(arr,1);

        System.out.println(arr.length-1-firstOcc+1);
    }

    static int getFirstIndex(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
