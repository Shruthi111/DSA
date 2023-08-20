// This is very inefficient coz doesn't work for large n value,say 100 coz,there are somany func calls
// So use memoization:Store the prev func call values

import java.util.ArrayList;

public class fibonacci{
    public static void main(String[] args) {
        int n=50;

        System.out.println(fib(n));
    }
    // static long mem[]=new long[10000];
    static long fib(int n){

        if(n==0 || n==1)
        return n;

        // if(mem[n-1]==0)
        // mem[n-1]=fib(n-1);
        // if(mem[n-2]==0)
        // mem[n-2]=fib(n-2);
        // return mem[n-1]+mem[n-2];

        return fib(n-1)+fib(n-2);
    }
}