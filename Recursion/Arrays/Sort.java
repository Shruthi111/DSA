import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // mergeSort(arr,0,arr.length-1);
        // quickSort(arr,0,arr.length-1);
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){
         for(int i=1;i<=arr.length-1;i++){
            boolean swapped=false;
            for(int j=1;j<=arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            break;
        }
    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lastIdx=arr.length-i-1;
            int maxIdx=getmax(arr,0,lastIdx);

            int temp=arr[lastIdx];
            arr[lastIdx]=arr[maxIdx];
            arr[maxIdx]=temp;

        }

    }
    static int getmax(int arr[],int start,int end){
        int maxIdx=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[maxIdx])
            maxIdx=i;
        }

        return maxIdx;
    }

    static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }

    }
    static void mergeSort(int arr[],int start,int end){
        if(start>=end)
        return;

        int mid=start+(end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr,start,mid,end);
    }

    static void merge(int arr[],int s,int m,int e){
        int mix[]=new int[e-s+1];

        int i=s,j=m+1,k=0;

        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }
            else{
                mix[k++]=arr[j++];
            }
        }

        while(i<=m){
           mix[k++]=arr[i++]; 
        }
        while(j<=e){
           mix[k++]=arr[j++]; 
        }

        for(int z=0,o=s;z<mix.length;z++,o++){
            arr[o]=mix[z];
        }

    }
    static void quickSort(int arr[],int s,int e){
        if(s<e){
            int pivotIdx=partition(arr,s,e);

            quickSort(arr, s, pivotIdx-1);
            quickSort(arr, pivotIdx+1,e);
        }
    }

    static int partition(int arr[],int s,int e){
        int pivot=arr[e];

        int i=s-1;

        for(int j=s;j<=e;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
            i++;
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;

            return i;

    }

    static void countSort(int arr[]){
        int i=0;
        while(i<arr.length-1){
            int crtIdx=arr.length-arr[i];

            if(arr[crtIdx]!=arr[i]){
                int temp=arr[crtIdx];
                arr[crtIdx]=arr[i];
                arr[i]=temp;
            }
            else
            i++;
        }
    }
}
