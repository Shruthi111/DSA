import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,10,8};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[],int start,int end){
        if(start>=end)
        return;

        int pidx=partition(arr,start,end);
        quickSort(arr, start, pidx-1);
        quickSort(arr, pidx+1,end);

    }
    static int partition(int arr[],int start,int end){
        // int pivotidx=end;
        int pivot=arr[end];

        int i=start-1;

        int j=start;
        while(j<end){
            // if(arr[j]<arr[pivotidx]){
            //     i++;

            //     int temp=arr[j];
            //     arr[j]=arr[i];
            //     arr[i]=temp;
            // }
            // j++;
            if(arr[j]<pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }
        i++;
        // int temp=arr[pivotidx];
        // arr[pivotidx]=arr[i];
        // arr[i]=temp;
        int temp=arr[end];
        arr[end]=arr[i];
        arr[i]=temp;

        return i;
    }
}
