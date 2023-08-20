// Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.

// Example 1: 

// Input: M = 11, N = 9
// Output: 2
// Explanation: Binary representation of the given 
// numbers are: 1011 and 1001, 
// 2nd bit from right is different.

public class rightmostdifferentbit {
    public static void main(String[] args) {
        int m=52,n=4;
        int pos=1;

        while(m>=0 && n>=0){
            int ld1=m&1;
            int ld2=n&1;

            if(ld1==ld2)
            pos++;
            else
            break;

            m=m>>1;
            n=n>>1;
        }

        System.out.println(pos);
    }
}
