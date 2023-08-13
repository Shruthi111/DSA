public class aRaiseb {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        // System.out.println(Math.pow(a, b));
        // This takes O(b)

        int base=2;
        int power=6;
        int ans=1;

        // this takes O(log(power))
        // while(power!=0){
        //     int ld=power & 1;
        //     if(ld==1)
        //     ans*=base;

        //     base*=base;
        //     power>>=1;
        // }

        for(int i=1;i<=power;i++){
            ans*=base;
        }

        System.out.println(ans);
        
    }
}
