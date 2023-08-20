// Longest Consecutive 1's 

// Given a number N. Find the length of the longest consecutive 1s in its binary representation.

// Example 1:

// Input: N = 14
// Output: 3
// Explanation: 
// Binary representation of 14 is 
// 1110, in which 111 is the longest 
// consecutive set bits of length is 3.

public class longest_consequtive_ones {
    public static void main(String[] args) {
        int n=222;
        int cur=0,max=0;

        while(n>0){
            int ld=n&1;
            if(ld==1)
            {
                cur++;
                max=Math.max(max, cur);
            }
            else
            cur=0;

            n>>=1;
        }

        System.out.println(max);
    }
}
