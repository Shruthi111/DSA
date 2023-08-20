import java.util.Arrays;

public class matrix_multiplication {
    public static void main(String[] args) {
        int a[][]={
            {2,4,1,2},
            {8,4,3,6},
        {1,7,9,5}};

        int n=3;
        int m=4;

        int b[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {4,5,6}
        };

        int o=3;

        int ans[][]=new int[n][o];

        for(int i=0;i<n;i++){
            for(int j=0;j<o;j++){
                for(int k=0;k<m;k++){
                    ans[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        for(int row[]:ans){
            System.out.println(Arrays.toString(row));
        }

    }
    
}
