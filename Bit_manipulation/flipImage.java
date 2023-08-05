import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int image[][]={
                        {1,1,0},
                        {1,0,1},
                        {0,0,0}
                        };

        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }

        for(int row[]:image){
            for(int ele=0;ele<(image[0].length+1)/2;ele++){
                int temp=row[ele];
                row[ele]=row[image[0].length-ele-1]^1;
                row[image[0].length-ele-1]=temp^1;
            }
        }

        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
}
