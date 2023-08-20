import java.util.Stack;

public class infixTopostfix{
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();

        // Adding '\0' to stack to keep track of bottom of stack
        stack.push('\0');

        String input="a^b^c";
        String res=""; //Variable to hold the output(Postfix expression)

        for(int i=0;i<input.length();i++){
            if(Character.isLetterOrDigit(input.charAt(i)))  //If it is an operand,then push it to stack
            res+=input.charAt(i);
            else if(input.charAt(i)=='(')  //If it is a '(' ,push it to stack directly
            stack.push('(');
            // If it is closing bracket,pop the items from the stack until you get '('
            else if(input.charAt(i)==')')  
            {
                while(stack.peek()!='('){
                   res+=stack.pop();
                }
                stack.pop();
            }
            // To handle right associativity 
            else if(input.charAt(i)=='^'){
                int prec=getPrecedence(input.charAt(i));
                while(getPrecedence(stack.peek())>prec){
                    res+=stack.pop();
                }
                stack.push(input.charAt(i));
            }
            // For operators,check precedence and accordingly push
            else
            {
                int prec=getPrecedence(input.charAt(i));
                while(getPrecedence(stack.peek())>=prec){
                    res+=stack.pop();
                }
                stack.push(input.charAt(i));
            }
        }
        // At the end pop all the items from the stack and append it to result
        while(stack.peek()!='\0'){
            res+=stack.pop();
        }

        System.out.println(res);


    }

    static int getPrecedence(char c){
        switch(c){
            case '(':return 1;
            case '+':
            case '-':return 2;
            case '*':
            case '/':return 3;
            case '^':return 4;
            case '\0':return 0;
            default:
            System.out.println("Invalid");
                    System.exit(0);
                    return -1;
        }
    }
}