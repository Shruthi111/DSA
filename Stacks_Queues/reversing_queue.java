import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
// import java.util.*;

public class reversing_queue {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            stack.push(q.remove());
        }

        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
