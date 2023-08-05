public class FirstLastIndex {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;

        int startIdx=getSearchIndex(arr,target,true);
        int endIdx=getSearchIndex(arr,target,false);

        System.out.println(startIdx+" "+endIdx);
    }
    static int getSearchIndex(int arr[],int target,boolean firstIndex){
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
                if(firstIndex){
                    end=mid-1;
                }
                else
                start=mid+1;
            }
        }

        return ans;
    }
    
}
