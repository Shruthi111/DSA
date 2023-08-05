public class CountZeroes {
    public static void main(String[] args) {
        int n=35020030;

        System.out.println(countZeroes(n));
    }
    static int countZeroes(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0)
        return count;
        int ld=n%10;
        if(ld==0)
        return helper(n/10, count+1);
        else
        return helper(n/10, count);
    }
}
