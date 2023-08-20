import java.util.LinkedList;
import java.util.Queue;

public class FormingNos {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();

        q.add("5");
        q.add("6");

        int n=10;

        for(int i=0;i<n;i++){
            String cur=q.peek();

            System.out.println(cur);

            q.remove();

            q.add(cur+"5");
            q.add(cur+"6");
        }
    }
}
