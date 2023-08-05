// Print if a number is prime or not (Input n from the user). 

// import java.util.*;

// public class prime{
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);

//         System.out.println("Enter n");
//         int n=in.nextInt();

//         int i;
//         for(i=2;i<n;i++){
//             if(n%i==0)
//                 break;     
//         }
//         if (n==i){
//             System.out.println("Prime");
//         }
//         else
//             System.out.println("Not prime");
//     }
// }

// Optimized approach:
// Eg 36:2*18,3*12,4*9,6*6,
// 9*4,12*3,18*2 which are repeated...this will cause problem in case of a large number.Say 1232433435
// To check if this is prime we need to do 1232433435-2 operations but we can do this in 35,106 operations

import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter n");
        int n=in.nextInt();

        int i;
        boolean flag=false;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                {flag=true;
                break; }    
        }
        if (flag==false){
            System.out.println("Prime");
        }
        else
            System.out.println("Not prime");
    }
}
