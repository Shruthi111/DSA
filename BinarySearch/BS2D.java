import java.util.Arrays;

public class BS2D{
    public static void main(String[] args) {
        
        int arr[][]={
                    {10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {30,31,42,50},
                    
        };

        int target=35;

        System.out.println(Arrays.toString(getIdx(arr,target)));
    }
    static int[] getIdx(int arr[][],int target){
        int r=0;
        int c=arr.length-1;

        while(r<=arr.length-1 && c>=0){
            if(arr[r][c]==target)
            return new int[]{r,c};
            else if(arr[r][c]<target)
            r++;
            else
            c--;
        }

        return new int[]{-1,-1};
    }
}