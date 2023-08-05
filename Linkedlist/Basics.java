class Node{
    String data;
    Node next;

    public Node(String data)
    {
        this.data=data;
        this.next=null;
    }
}

class LL{
    int size=0;
    Node head;

    void insertFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    void insertLast(String data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=newNode;
        }
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Ntng to delete");
            return;
        }
        head=head.next;
        size--;
    }

    void deleteLast(){
        Node cur=head;
        Node prev=null;
        size--;

        if(head==null){
            System.out.println("Ntng to delete");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        while(cur.next!=null){
            prev=cur;
            cur=cur.next;
        }
        prev.next=null;

    }

    void remove(int pos){
        Node cur=head;
        int count=1;

        if(head==null){
            System.out.println("Ntng to delete");
            return;
        }
        
        if(pos==1){
            deleteFirst();
            return;
        }
        if(pos==size){
            deleteLast();
            return;
        }

        while(cur!=null && count!=pos-1){
            cur=cur.next;
            count++;
        }

        cur.next=cur.next.next;
        size--;
    }

    void insert(String data,int pos){

        Node newnode=new Node(data);
        Node cur=head;

        int count=1;

        if(pos==1)
        {
            insertFirst(data);
            return;
        }
        if(pos==size){
            insertLast(data);
            return;
        }

        while(cur!=null && count!=pos-1){
            cur=cur.next;
            count++;
        }
        newnode.next=cur.next;
        cur.next=newnode;

        size++;
       
    }

    void display(){
        Node cur=head;

        if(head==null){
        System.out.print("List is empty");
        return;
        }

        while(cur!=null){
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }

        System.out.print(" null");
    }

    int getSize(){
        return size;
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

        newnode.next=p.next;
        p.next=newnode;
        size++;
    }

    void reverse(){
        

        if(head==null || head.next==null)
        return;

        Node prev=head;
        Node cur=head.next;

        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            

            prev=cur;
            cur=next;
        }

        head.next=null;
        head=prev;
    }

    Node recRev(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newhead=recRev(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }
}



public class Basics{
    public static void main(String[] args) {
        LL list=new LL();

        list.insertLast("1");
        list.insertLast("2");
        list.insertLast("3");
        // list.insertLast("4");
        // list.insert("hello",1);
        // list.insertAfter("Soumya", "Shruthi");
        // list.deleteFirst();
        // list.deleteLast();
        // list.insert("5",3);
        // list.display();
        // list.reverse();
        list.head=list.recRev(list.head);
        list.display();
    }
}