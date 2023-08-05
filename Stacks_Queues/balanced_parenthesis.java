// To check if the given string has balanced parenthesis
// import java.util.Stack;

// public class balanced_parenthesis {
//     public static void main(String[] args) {
//         String input="(){}[";
//         boolean isValid=true;

//         Stack<Character> stack =new Stack<>();

//         for(int i=0;i<input.length();i++){
//             if(input.charAt(i)=='(' ||input.charAt(i)=='{' || input.charAt(i)=='['){
//                 stack.push(input.charAt(i));
//             }
//             else if(input.charAt(i)==')'){
//                 if(stack.isEmpty() || stack.pop()!='('){
//                     isValid=false;
//                     break;
//                 }
//             }
//             else if(input.charAt(i)=='}'){
//                 if( stack.isEmpty() || stack.pop()!='{'){
//                     isValid=false;
//                     break;
//                 }
//             }
//             else if(input.charAt(i)==']'){
//                 if(stack.isEmpty() || stack.pop()!='['){
//                     isValid=false;
//                     break;
//                 }
//             }
//         }

//         System.out.println(isValid && stack.isEmpty());
//     }
// }

// Minimum to add to make the parenthesis balanced:

import java.util.Stack;

public class balanced_parenthesis {
    public static void main(String[] args) {
        String input="(()(((())";
       
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek()=='(')
                stack.pop();
                else
                stack.push(input.charAt(i));
            }
            else{
                stack.push(input.charAt(i));
            }
        }

        System.out.println(stack.size());


    }
}