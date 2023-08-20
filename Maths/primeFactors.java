import java.util.ArrayList;

public class primeFactors {
    public static void main(String[] args) {
        int n=100;
        ArrayList<Integer> factors=new ArrayList<>();

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 && n/i==i)
                factors.add(i);
            else if(n%i==0)
            {
                factors.add(i);
                factors.add(n/i);
            }
        }

        for(int i=0;i<factors.size();i++){
            if(isprime(factors.get(i)))
            System.out.println(factors.get(i));
        }
    }

    static boolean isprime(int n){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
