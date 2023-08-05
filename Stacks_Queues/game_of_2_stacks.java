import java.util.Scanner;
import java.util.Stack;

public class game_of_2_stacks {
    public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    int games=in.nextInt();
    
    for(int i=0;i<games;i++){
        playgame();
    }
    
    }

    static void playgame(){

        Scanner in=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        int n1=in.nextInt();
        int n2=in.nextInt();
        int max=in.nextInt();

        for(int i=0;i<n1;i++){
            st1.push(in.nextInt());
        }

        for(int i=0;i<n2;i++){
            st2.push(in.nextInt());
        }

        System.out.println(getMaxMoves(max,st1,st2,0,0)-1);
    }

    static int getMaxMoves(int maxsum,Stack<Integer> st1,Stack<Integer> st2,int sum,int moves){

        
        if(sum>maxsum)
            return moves;

        if(st1.isEmpty() || st2.isEmpty())
        return moves;

        int popped=st1.pop();
        int m1=getMaxMoves(maxsum,st1,st2,sum+popped,moves+1);
        st1.push(popped);

        popped=st2.pop();
        int m2=getMaxMoves(maxsum,st1,st2,sum+popped,moves+1);
        st2.push(popped);

        return Math.max(m1, m2);
  
    }

}
