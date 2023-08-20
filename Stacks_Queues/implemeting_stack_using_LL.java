public class implemeting_stack_using_LL {
    public static void main(String[] args) {
        Stack1 stack=new Stack1();
        stack.push("Apple");
        stack.push("banana");
        stack.push("a");
        stack.push("aa");
        stack.push("aaa");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
class Node{
    String data;
    Node next;

    public Node(String data){
        this.data=data;
        this.next=null;
    }
}

class Stack1{
    Node head;
    int size=0;

    public void push(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            size++;
            return;
        }


        newNode.next=head;
        head=newNode;

        size++;
    }

    public String pop(){
        if(head==null)
        return "Nothing to pop";

        String popped=head.data;

        head=head.next;

        size--;

        return popped;

    }

    public String peek(){
        if(head==null)
        return "Stack empty";

        String peeked=head.data;

        return peeked;
    }

    public int size(){
        return this.size;
    }
}
