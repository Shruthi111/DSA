// Swap all odd and even bits 
// Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

// Example 1:

// Input: N = 23
// Output: 43
// Explanation: 
// Binary representation of the given number 
// is 00010111 after swapping 
// 00101011 = 43 in decimal.

public class swap_even_odd_bits {
    public static void main(String[] args) {
        int n=2;

        int evenBits=n & 0XAAAAAAAA;
        int oddBits=n & 0X55555555;

        evenBits>>=1;
        oddBits<<=1;

        System.out.println(evenBits | oddBits);
    }
}
