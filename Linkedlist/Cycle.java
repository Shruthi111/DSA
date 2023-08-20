// Finding if ll has cycle


// public class Cycle {
//     public static void main(String[] args) {
//         LL list=new LL();

//         list.insertLast("1");
//         list.insertLast("2");
//         list.insertLast("3");
//         list.insertLast("4");
//         list.insertLast("5");
//         list.insertLast("6");
//         list.insertLast("7");
//         list.insertLast("8");
        

//         Node head=list.head;

//         // Node cur=head;

//         // while(cur.next!=null){
//         //     cur=cur.next;
//         // }

//         // cur.next=list.find("4");

//         Node h=head;
//         Node t=h;
//         int count=0;
//         Node temp=null;

//         while(h.next!=null && h.next.next!=null){
//             t=t.next;
//             h=h.next.next;

//             if(h==t){
//                 System.out.println("Cycle detected");
//                  // Finding length of the cycle
//                 temp=t;
//                 do{
//                 temp=temp.next;
//                 count++;
//                 }while(t!=temp);

//                 System.out.println(count);

//                 return;
//             }
//         }

//         System.out.println("No cycle");
//         System.out.println(count);
//     }
// }

// Finding the starting point of the cycle

public class Cycle {
    public static void main(String[] args) {
        LL list=new LL();

        list.insertLast("1");
        list.insertLast("2");
        list.insertLast("3");
        list.insertLast("4");
        list.insertLast("5");
        list.insertLast("6");
        list.insertLast("7");
        list.insertLast("8");
        

        Node head=list.head;

        Node cur=head;

        while(cur.next!=null){
            cur=cur.next;
        }

        cur.next=list.find("4");

        Node h=head;
        Node t=h;
        int count=0;
        Node temp=null;

        while(h.next!=null && h.next.next!=null){
            t=t.next;
            h=h.next.next;

            if(h==t){
                System.out.println("Cycle detected");
                 // Finding length of the cycle
                temp=t;
                do{
                temp=temp.next;
                count++;
                }while(t!=temp);

                System.out.println(count);

                break;
            }
        }

        Node f=head;
        Node s=head;
        int c=0;

        while(c!=count){
            s=s.next;
            c++;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }

        System.out.println(f.data);
    }
}
