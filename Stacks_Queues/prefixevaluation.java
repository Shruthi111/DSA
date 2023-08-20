import java.util.Stack;

public class prefixevaluation {
    public static void main(String[] args) {
        String input="^^123";
        int res=0;

        Stack<Integer> stack=new Stack<>();

        for(int i=input.length()-1;i>=0;i--){
            if(Character.isDigit(input.charAt(i)))
            stack.push(input.charAt(i)-'0');

            else
            {
                char op=input.charAt(i);
                int op2=stack.pop();
                int op1=stack.pop();
                

                switch(op){
                    case '+':res=op1+op2;
                    break;
                    case '*':res=op1*op2;
                    break;
                    case '/':res=op1/op2;
                    break;
                    case '-':res=op1-op2;
                    break;
                    case '^':res=op1^op2;
                    break;
                }

                stack.push(res);

            }
            
        }

        if(stack.size()==1)
            System.out.println(res);
        else
        System.out.println("invalid");
    }
}
