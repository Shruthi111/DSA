// Count occurences of an element in the sorted array

public class countOcurrences {
    public static void main(String[] args) {
        
        int arr[]={10,20,20,20,40,40};
        int target=50;

        int firstOcc=getFirstLastIndex(arr,target,true);
        if(firstOcc!=-1){
            int lastOcc=getFirstLastIndex(arr,target,false);
            System.out.println(lastOcc-firstOcc+1);
        }
        else{
            System.out.println(0);
        }
    }
    static int getFirstLastIndex(int arr[],int target,boolean firstIndex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstIndex)
                end=mid-1;
                else
                start=mid+1;
            }
        }

        return ans;
    }
}
