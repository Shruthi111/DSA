import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k--;
            }
            k=2;
            for(int j=2;j<=i;j++){
               
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

