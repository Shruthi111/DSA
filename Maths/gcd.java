public class gcd {
    public static void main(String[] args) {
        int a=48;
        int b=36;

        // System.out.println(findGcd1(a,b));
        int hcf=findGcd2(a,b);
        System.out.println(hcf);
        int lcm=(a*b)/hcf;
        System.out.println(lcm);
    }
    static int findGcd1(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
    static int findGcd2(int a,int b){
        if(b==0)
        return a;

        return findGcd2(b,a%b);
    }
}
