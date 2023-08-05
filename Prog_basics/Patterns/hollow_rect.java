import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int row=in.nextInt();
        int col=in.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if((i==1) || (i==row) || (j==1) || (j==col))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
