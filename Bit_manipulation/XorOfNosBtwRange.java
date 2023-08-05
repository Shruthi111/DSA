public class XorOfNosBtwRange {
    public static void main(String[] args) {
        int a=3;
        int b=9;

        int totalXor=findXorTilla(b);
        System.out.println(totalXor);

        int extras=findXorTilla(a-1);
        System.out.println(extras);

        System.out.println(totalXor^extras);
    }
    static int findXorTilla(int a){
        if(a%4==0)
        return a;
        else if(a%4==1)
        return 1;
        else if(a%4==2)
        return a+1;
        else
        return 0;
    }
}
