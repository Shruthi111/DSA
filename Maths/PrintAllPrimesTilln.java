public class PrintAllPrimesTilln {
    public static void main(String[] args) {
        int n=40;

        // 1st method:
        // for(int i=2;i<=n;i++){
        //     if(isPrime(i))
        //     System.out.println(i);
        // }
        // Time complexity here is:O(n*sqrt(i))

        // 2nd :
        boolean arr[]=new boolean[n+1];
        sieve(arr,n);
         // Time complexity here is:O(n*log(logn))
        //  Space complexity:O(n)

    }
    static boolean isPrime(int n){

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    static void sieve(boolean arr[],int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i])
            System.out.println(i);
        }
    }
}
