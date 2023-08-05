// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*;
public class calci{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a and b");
        int a=in.nextInt();
        int b=in.nextInt();

        System.out.println("Enter the operator: ");
        char op=in.next().toCharArray()[0];
        
        switch(op){
            case '+':System.out.println("Sum= "+(a+b));
                    break;
            case '-':System.out.println("Difference= "+(a-b));
                    break;
            case '*':System.out.println("Product= "+(a*b));
                    break;
            case '/':
                    if (b==0){
                        System.out.println("Divide by zero error!");
                    }
                    else{
                    System.out.println("Quotient= "+(a/b));
                    }
                    break;
            case '%':
                    if (b==0){
                        System.out.println("Divide by zero error!");
                        }
                    else{
                        System.out.println("Remainder= "+(a%b));
                        
                        }    
                    break;
           default:System.out.println("Invalid operator");
        }
    }
}