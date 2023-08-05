// Print all even numbers till n.

import java.util.*;

public class even_nos_till_n{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter n");
        int n=in.nextInt();

        for(int i=0;i<=n;i=i+2){
            System.out.print(i+" ");
        }


    }
}