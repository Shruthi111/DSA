class Node{
    String data;
    Node next;
    Node prev;

    Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DLL{
    int size=0;
    Node head=null;

    void insertFirst(String data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    void insertLast(String data){
       Node newnode=new Node(data);
       

        if(head==null){
            head=newnode;
            return;
        }

        Node cur=head;

        while(cur.next!=null){
            cur=cur.next;
        }

        cur.next=newnode;
        newnode.prev=cur;
        
        
    }

    void display(){
        Node cur=head;

        while(cur!=null){
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }
        System.out.print(" null");
    }

    void displayRev(){
        Node cur=head;
        Node last=null;

        while(cur!=null){
            last=cur;
            cur=cur.next;
        }
        while(last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.println(" null");
    }

    Node find(String val){
        Node cur=head;

        while(cur!=null){
            if(cur.data==val){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }

    void insertAfter(String data,String after){
        Node newnode=new Node(data);

        Node p=find(after);

        if(p==null){
            System.out.println("Doesn't exist");
            return;
        }
        p.next.prev=newnode;
        newnode.next=p.next;
        newnode.prev=p;
        p.next=newnode;


    }
}

public class DoubleLL{
    public static void main(String[] args) {
        DLL list=new DLL();
        // list.display();
        list.insertFirst("hello");
        list.insertFirst("hi");
        list.insertLast("yo");
        list.insertAfter("yoyo", "hi");
        list.display();
        // list.displayRev();
    }
}