// Bit Difference 
// You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

// Example 1:

// Input: A = 10, B = 20
// Output: 4
// Explanation:
// A  = 01010
// B  = 10100
// As we can see, the bits of A that need 
// to be flipped are 01010. If we flip 
// these bits, we get 10100, which is B.

public class Bitdifference {
    public static void main(String[] args) {
        int a=20,b=25;

        int xor=a^b;
        int count=0;

        while(xor>0){
            int ld=xor & 1;
            if(ld==1)
            count++;

            xor>>=1;
        }

        System.out.println(count);
        }
}
