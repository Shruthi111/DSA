public class CeilFloor {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,10};
        int target=9;

        System.out.println(getFloorValue(arr,target));
        System.out.println(getCeilValue(arr,target));
    }


    static int getFloorValue(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            return arr[mid];
            if(arr[mid]>target)
            end=mid-1;
            else if(arr[mid]<target)
            start=mid+1;
            
        }
        return arr[end];
    }

    static int getCeilValue(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            return arr[mid];
            if(arr[mid]>target)
            end=mid-1;
            else if(arr[mid]<target)
            start=mid+1;
            
        }
        return arr[start];
    }
}
