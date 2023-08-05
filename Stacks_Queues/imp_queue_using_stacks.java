// Question:Implement queue using stacks.Can use 2 stacks

// Method1:insertion is efficient-O(1),deletion is O(n)

// import java.util.Stack;

// public class imp_queue_using_stacks{

//     public static void main(String[] args) {
        
//         Queue queue=new Queue();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         queue.add(5);
//         queue.add(6);

//         System.out.println(queue.peek());
//         queue.remove();
//         System.out.println(queue.peek());

//     }
   
// }

// class Queue{
//     Stack<Integer> st1=new Stack<>();
//     Stack<Integer> st2=new Stack<>(); 

//     public void add(int item){
//         st1.push(item);
//     }

//     public int remove(){

//         while(!st1.isEmpty()){
//             st2.push(st1.pop());
//         }

//         int removed=st2.pop();

//         while(!st2.isEmpty()){
//             st1.push(st2.pop());
//         }

//         return removed;

//     }

//     public int peek(){

//         while(!st1.isEmpty()){
//             st2.push(st1.pop());
//         }

//         int peeked=st2.peek();

//         while(!st2.isEmpty()){
//             st1.push(st2.pop());
//         }

//         return peeked;

//     }
// }

// Method2:deletion is efficient-O(1),insertion is O(n)

import java.util.Stack;

public class imp_queue_using_stacks{

    public static void main(String[] args) {
        
        Queue queue=new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());

    }
   
}

class Queue{
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>(); 

    public void add(int item){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        st1.push(item);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public int remove(){

        int removed=st1.pop();
        return removed;

    }

    public int peek(){

        int peeked=st1.peek();

        return peeked;

    }
}

