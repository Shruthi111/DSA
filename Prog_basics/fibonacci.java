import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.


public class fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int fib1=0;
        int fib2=1;
        System.out.println(fib1);
        System.out.println(fib2);
        for(int i=3;i<=n;i++){
            int fib3=fib1+fib2;
            System.out.println(fib3);
            fib1=fib2;
            fib2=fib3;
        }

    }
}
