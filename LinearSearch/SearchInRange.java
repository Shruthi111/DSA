public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={34,25,67,8,1213,43};
        int target=43;
        int start=1,end=3;

        System.out.println(getSearchIndex(arr,target,start,end));
    }
    static int getSearchIndex(int arr[],int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
