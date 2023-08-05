import java.util.Scanner;

public class solid_rect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int row=in.nextInt();
        int col=in.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
