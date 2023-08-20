// Number is sparse or not 

// Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.

// Example 1:

// Input: N = 2
// Output: true
// Explanation: Binary Representation of 2 is 10, 
// which is not having consecutive set bits. 
// So, it is sparse number.

public class sparse_number {
    public static void main(String[] args) {
        int n=3;
        int prev=0;
        boolean flag=true;

        while(n>0){
            int ld=n & 1;
            if(ld==1 && ld==prev){
                flag=false;
                break;
            }
            prev=ld;
            n>>=1;
        }

        System.out.println(flag);
    }
}
