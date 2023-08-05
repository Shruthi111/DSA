public class PascalsTri {
    public static void main(String[] args) {
        // int n=3;
        // int r=2;

        // int ncr=findFactorial(n)/((findFactorial(n-r)*findFactorial(r)));
        // System.out.println(ncr);



        // Printing Pascal's triangle:
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(findFactorial(i)/((findFactorial(i-j)*findFactorial(j)))+" ");
            }
            System.out.println();
        }

        // Calculate sum of mth row;
        int m=5;
        System.out.println(1<<m-1);


    }
    static int findFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;

        return fact;
    }
}
