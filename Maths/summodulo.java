// Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 10^9+7.

import java.util.Scanner;

public class summodulo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();

        long mod=10000000007L;

        System.out.println(((a%mod)+(b%mod))%mod);
    }
}
