// Given an array ,for each element print the first smaller element in the right,if no smaller ele,print -1

// Brute force :Time complexity:O(n^2)
// public class next_smaller_ele {
//     public static void main(String[] args) {
//         int arr[]={2,1,4,3};
//         int j;

//         for(int i=0;i<arr.length;i++){
//             for(j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[i])
//                 {
//                     System.out.println(arr[i]+"->"+arr[j]);
//                     break;
//                 }
//             }
//             if(j==arr.length){
//                 System.out.println(arr[i]+"->-1");
//             }
//         }
//     }
// }

// Optimized approach:

// import java.util.Stack;

// public class next_smaller_ele {
//     public static void main(String[] args) {
//         int arr[]={2,1,4,3};

//         Stack<Integer> stack=new Stack<>();
//         stack.push(-1);

//         for(int i=arr.length-1;i>=0;i--){
            
//             while(stack.peek()>=arr[i]){
//                     stack.pop();
//             }
//             System.out.println(arr[i]+"->"+stack.peek());
//             stack.push(arr[i]);
//         }
//     }
// }

// Given an array ,for each element print the first smaller element in the left,if no smaller ele,print -1

import java.util.Stack;

public class next_smaller_ele {
    public static void main(String[] args) {
        int arr[]={2,1,4,3};

        Stack<Integer> stack=new Stack<>();
        stack.push(-1);

        for(int i=0;i<arr.length;i++){
            
            while(stack.peek()>=arr[i]){
                    stack.pop();
            }
            System.out.println(arr[i]+"->"+stack.peek());
            stack.push(arr[i]);
        }
    }
}
