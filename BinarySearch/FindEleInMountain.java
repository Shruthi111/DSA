public class FindEleInMountain {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,0};
        int target=10;

        int peakIdx=findPeakIdx(arr);
        if(arr[peakIdx]==target)
        System.out.println(peakIdx);

        int firsttry=binarySearch(arr,target,0,peakIdx-1);
        if(firsttry!=-1)
        System.out.println(firsttry);
        else
        System.out.println(binarySearch(arr,target,peakIdx+1,arr.length-1));
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
    static int binarySearch(int arr[],int target,int start,int end){
        boolean isAsc=false;
        
        if(arr[start]<arr[end])
        isAsc=true;

         while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            return mid;
            else 
            if(isAsc){
            if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;}
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
