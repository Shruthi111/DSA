public class PowerOf2 {
    public static void main(String[] args) {
        int n=128;

        if(n!=0 && (n & (n-1))==0)
        System.out.println("Power of 2");
        else
        System.out.println("No");

        // 1st method
        /*int count=0;

        while(n!=0){
            int ld=n & 1;
            if(ld==1)
            count++;

            n>>=1;
        }

        if(count==1)
        System.out.println("Yes");
        else
        System.out.println("No");
        */

        // Without bit manipulation

        // while(n%2==0){
        //     n=n/2;
        // }
        // System.out.println((n == 1) ? "yes" : "No");

    }
}
