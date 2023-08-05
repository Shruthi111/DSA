public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,23,45,67,78,90,100,101,102,105,189,200,205,208};
        int target=210;
        System.out.println(getSearchIndex(arr,target));
    }

    static int getSearchIndex(int arr[],int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        
        int ans=binarySearch(arr,target,start,end);
        return ans;
    }
    static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            return mid;
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
}
