import java.util.Arrays;

// Transpose of a normal matrix
// public class transpose {
//     public static void main(String[] args) {
//         int arr[][]={
//             {1,2,3,10},
//             {4,5,6,12},
//             {7,8,9,18}
//         };

//         int n=3;
//         int m=4;
//         int ans[][]=new int[m][n];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 ans[j][i]=arr[i][j];
//             }
//         }
//         for(int row[]:ans){
//             System.out.println(Arrays.toString(row));
//         }

//     }
// }


// Square matrix
public class transpose {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=3;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int row[]:arr){
            System.out.println(Arrays.toString(row));
        }

    }
}