public class NoOfDigitsInBaseb {
    public static void main(String[] args) {
        int n=128;

        // First method:
        // int count=0;
        // while(n!=0){
        //     count++;
        //     n>>=1;
        // }

        // System.out.println(count);

        // Second method:
        System.out.println((int)(Math.log(n)/Math.log(2))+1);
    }
}
