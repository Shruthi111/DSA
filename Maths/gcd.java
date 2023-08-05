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
        while(a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }
    static int findGcd2(int a,int b){
        if(a==0)
        return b;

        return findGcd2(b%a, a);
    }
}
