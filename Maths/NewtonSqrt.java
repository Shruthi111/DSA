public class NewtonSqrt {
    public static void main(String[] args) {
         int n=40;
         System.out.println(findNewtonSqrt(n));
    }
    static double findNewtonSqrt(int n){
        double x=n;
        double root;

        while(true){
            root=0.5*(x+(n/x));
            double error=Math.abs(root-x);
            if(error<1)
                break;

            x=root;
            
        }
        return root;
    }
}
