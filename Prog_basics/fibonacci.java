import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.


// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         long n=in.nextInt();

//         long fib1=0;
//         long fib2=1;
//         System.out.println(fib1);
//         System.out.println(fib2);
//         for(int i=3;i<=n;i++){
//             long fib3=fib1+fib2;
//             System.out.println(fib3);
//             fib1=fib2;
//             fib2=fib3;
//         }

//     }
// }



// With recursion:This is inefficient for this problem becoz it is linear recursion.Same calls are made again and again.If u try fib(50),program is stuck coz it results in stack overflow coz of so many calls.
//Time complexity is exponential(bad) 

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         long n = in.nextInt();

//         long ans = fib(n);

//         System.out.println(ans);
//     }

//     public static long fib(long n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }

//         return fib(n - 1) + fib(n - 2);
//     }
// }

// Without recursion

// public class fibonacci{
// public static void main(String[] args) {
// Scanner in=new Scanner(System.in);

// long n=in.nextInt();

// long ans=fib(n);

// System.out.println(ans);
// }
// public static long fib(long n){
// long fib0=0,fib1=1;
// for(int i=2;i<=n;i++){
// long fib2=fib1+fib0;
// fib0=fib1;
// fib1=fib2;
// }
// return fib1;
// }
// }

// Better approach using a formula

public class fibonacci{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
long n=50;

long ans=fib(n);

System.out.println(ans);
}
public static long fib(long n){
return (long)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
}

}

