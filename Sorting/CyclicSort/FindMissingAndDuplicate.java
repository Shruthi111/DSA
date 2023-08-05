import java.util.Arrays;

public class FindMissingAndDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println(Arrays.toString(getDuplicateAndMissing(arr)));

    }
    static int[] getDuplicateAndMissing(int arr[]){
        int i=0;
        while(i<arr.length){
            int crtIdx=arr[i]-1;

            if(arr[i]<arr.length && arr[i]!=arr[crtIdx]){
                int temp=arr[i];
                arr[i]=arr[crtIdx];
                arr[crtIdx]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
