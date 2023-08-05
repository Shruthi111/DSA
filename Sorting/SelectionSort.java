import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int arr[]={1,20,3,0,-34};
        
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getMaxidx(arr,0,last);

            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }
    static int getMaxidx(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max])
            max=i;
        }
        return max;
    }
}
