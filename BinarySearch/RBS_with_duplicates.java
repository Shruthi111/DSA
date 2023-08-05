public class RBS_with_duplicates {
    public static void main(String[] args) {
        int arr[]={2,3,4,9,2,2,2};
        int target=2;

        int pivotIdx=getPivotIdx(arr);
        if(arr[pivotIdx]==target)
        System.out.println(pivotIdx);

        int firsttry=bs(arr,target,0,pivotIdx-1);
        if(firsttry!=-1)
        System.out.println(firsttry);
        else
        System.out.println(bs(arr,target,pivotIdx+1,arr.length-1));
    }
    static int getPivotIdx(int arr[]){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;

            //Case 1:if mid ele is greater than the next one
            if(arr[m]>arr[m+1]){
                return m;
            }
            //Case 2:if mid ele is less than the prev one
            else if(arr[m]<arr[m-1]){
                return m-1;
            }
            //case 3:if s,m,e all are equal,then skip it..but before skipping check if it is pivot
            else if(arr[m]==arr[s] && arr[m]==arr[e]){
                if(arr[s]>arr[s+1])
                return s;
                s++;
                if(arr[e]<arr[e-1])
                return e-1;
                e--;
            }
            // case 4:search in right part,left is sorted
            if(arr[s]<arr[m] || (arr[s]==arr[m] && arr[e]<arr[m])){
                s=m+1;
            }
            else
            e=m-1;
        }

        return -1;
    }

    static int bs(int arr[],int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;

            if(arr[m]==target)
            return m;
            else if(arr[m]>target){
                e=m-1;
            }
            else
            s=m+1;
        }
        return -1;
    }
}
