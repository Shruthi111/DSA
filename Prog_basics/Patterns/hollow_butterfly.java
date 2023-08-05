import java.util.Scanner;

public class hollow_butterfly {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (i==1 || j==1 || j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if (i==1 || j==1 || j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if (i==1 || j==1 || j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if (i==1 || j==1 || j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }

            System.out.println();
        }
      
    }
}

