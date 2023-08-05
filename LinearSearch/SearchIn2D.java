import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int arr[][]={{1,45,67},
                    {423,3,1},
                    {678,33,90}
                    };
        int target=30;
        System.out.println(Arrays.toString(getSearchIndex(arr,target)));
    }
    
    static int[] getSearchIndex(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
