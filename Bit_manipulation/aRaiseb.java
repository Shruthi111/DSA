public class aRaiseb {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        // System.out.println(Math.pow(a, b));
        // This takes O(b)

        int base=2;
        int power=6;
        int ans=1;

        while(power!=0){
            int ld=power & 1;
            if(ld==1)
            ans*=base;

            base*=base;
            power>>=1;
        }

        System.out.println(ans);
        // this takes O(log(power))
    }
}
