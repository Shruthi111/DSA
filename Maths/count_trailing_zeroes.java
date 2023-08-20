// Count the number of trailing zeroes in the factorial of a number

// Basic approach
// public class count_trailing_zeroes {
//     public static void main(String[] args) {
//         int n=10;

//         long fact=getFactorial(n);
//         System.out.println(fact);

//         System.out.println(countTrailingZeroes(fact));
//     }

//     static long getFactorial(int n){
//         long fact=1;

//         for(int i=2;i<=n;i++){
//             fact*=i;
//         }

//         return fact;
//     }

//     static int countTrailingZeroes(long n){
//         int count=0;

//         while(n>0){
//             long ld=n%10;
//             if(ld==0)
//             count++;

//             n=n/10;
//         }

//         return count;


//     }
// }

// This doesn't give answer for large n values


// Better approach:
// We know that in combination of 5 and 2 forms 0.If we somehow find the number of 5's in the no,we can find how many 0's are present in that no.Also no of 2's >no of 5's in factorial of a no.


public class count_trailing_zeroes {
    public static void main(String[] args) {

        int n=100;

        int ans=0;

        for(int i=5;i<=n;i=i*5){
            ans+=n/i;
        }

        System.out.println(ans);
    }
}