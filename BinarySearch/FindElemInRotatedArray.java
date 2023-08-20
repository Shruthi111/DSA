public class FindElemInRotatedArray {
    public static void main(String[] args) {
        int arr[]={6,7,1,2,3,4,5};
        int target=3;

        int pivotIdx=getPivotIdx(arr);
        if(arr[pivotIdx]==target)
        System.out.println(pivotIdx);

        int firsttry=binarySearch(arr,target,0,pivotIdx-1);
        if(firsttry!=-1)
        System.out.println(firsttry);
        else
        System.out.println(binarySearch(arr,target,pivotIdx+1,arr.length-1));
    }
    static int getPivotIdx(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            return mid;
            if(mid>start && arr[mid]<arr[mid-1])
            return mid-1;
            if(arr[start]>=arr[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
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
