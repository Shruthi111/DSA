// Binary To Gray Code equivalent 
// You are given a decimal number N. You need to find the gray code of the number N and convert it into decimal.

// Example 1:

// Input: N = 7
// Output: 4
// Explanation: 7 is represented as 111 in 
// binary form. The gray code of 111 is 100, 
// in the binary form whose decimal equivalent 
// is 4.

// public class BinaryToGray {
//     public static void main(String[] args) {
//         int n=10;

//        int gray=decimalToGray(n);
//        System.out.println(gray);
//     }

//     static int decimalToGray(int n){
//         return n ^ (n>>1);
//     }
// }

// Given N in Gray code equivalent. Find its binary equivalent. 
// Note: We need to find the binary equivalent of the given gray code and return the decimal equivalent of the binary representation.

// Example 1:

// Input: N = 4
// Output: 7
// Explanation:
// 4 is represented as gray 100 and its 
// binary equivalent is 111 whose decimal 
// equivalent is 7.

public class BinaryToGray {
    public static void main(String[] args) {
        int n=15;

       int bin=GrayToBinary(n);
       System.out.println(bin);
    }

    static int GrayToBinary(int n){
        int ans=0;

        while(n!=0){
            ans^=n;
            n>>=1;
        }

        return ans;
    }
}
