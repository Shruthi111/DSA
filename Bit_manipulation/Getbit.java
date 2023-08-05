public class Getbit {
    public static void main(String[] args) {
        int n=2;
        int i=3;
        System.out.println((n>>(i-1))&1);
        // System.out.println((n&(1<<(i-1)))>>(i-1));
    }
}
