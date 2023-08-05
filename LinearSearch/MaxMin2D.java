import java.util.Arrays;

public class MaxMin2D {
    public static void main(String[] args) {
        int arr[][]={{1,45,67},
                    {423,3},
                    {678,33,90}
                    };
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
    
    static int getMax(int arr[][]){
        int max=arr[0][0];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max)
                max=arr[row][col];
            }
        }
        return max;
    }
    static int getMin(int arr[][]){
        int min=arr[0][0];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min)
                min=arr[row][col];
            }
        }
        return min;
    }
}
