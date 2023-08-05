public class MagicNo {
    public static void main(String[] args) {
        int n=5;
        int mul=5;
        int ans=0;

        while(n!=0){
            int ld=n & 1;
            ans+=ld*mul;
            mul*=5; 
            n>>=1;
        }

        System.out.println(ans);
    }
}
