import java.util.*;
public class javaLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("Shruthi");
        list.addLast("S");
        list.addFirst("Ms");
        // list.removeFirst();
        // list.removeLast();
        list.remove(1);
        // System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }
}
