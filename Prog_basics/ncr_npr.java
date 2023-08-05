import java.util.Scanner;

public class ncr_npr {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();

        int ncr=factorial(n)/(factorial(n-r)*factorial(r));
        int npr=factorial(n)/(factorial(n-r));

        System.out.println(ncr);
        System.out.println(npr);

    }
}
