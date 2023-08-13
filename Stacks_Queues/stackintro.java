import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class stackintro {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<Integer>(); 
        stk.push(1);
        stk.push(2);

        System.out.println(stk.pop());
        System.out.println(stk.pop());

        Queue<Integer> q1=new LinkedList<>();

    }
}
