import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int n=36;

        findFactors3(n);
    }

    // O(n)
    static void findFactors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
            System.out.print(i+" ");
        }
    }

    // O(sqrt(n))
    static void findFactors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0 && n/i==i)
            System.out.print(i+" ");
            else
            System.out.print(i+" "+n/i+" ");
        }
    }

    // space complexity & time both are O(sqrt(n))
    static void findFactors3(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0 && n/i==i)
            System.out.print(i+" ");
            else
            {
             System.out.print(i+" ");
             list.add(n/i);
            }
        }

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }


}
