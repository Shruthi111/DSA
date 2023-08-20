// Find the numbers from 1 to n with exactly 3 divisors

// The number has exactly 3 divisors if it is a prefect square number and squareroot of it is a prime no.

public class nos_with_3divisors {
    public static void main(String[] args) {
        int n=500;

        for(int i=2;i<=Math.sqrt(n);i++){
            int sqrt=(int)Math.sqrt(i);

            if(sqrt*sqrt==i && isprime(sqrt))
            System.out.println(i);
        }

    }

    static boolean isprime(int n){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }

        return flag;
    }
}
