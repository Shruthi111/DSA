// Write a function to calculate the factorial of a number.

import java.util.*;

public class factorial{

    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    } 
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
}