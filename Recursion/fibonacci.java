public class fibonacci{
    public static void main(String[] args) {
        int n=2;

        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n==0 || n==1)
        return n;
        return fib(n-1) + fib(n-2);
    }
}