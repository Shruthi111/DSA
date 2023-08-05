// Method1:
// public class Reverse {
//     public static void main(String[] args) {
//         int n=3452;
//         rev(n);

//         System.out.println(rev);
//     }
//     static int rev;
//     static void rev(int n){
//         if (n==0)
//         return;
//         int ld=n%10;
//         rev=rev*10+ld;
//         rev(n/10);
//     }
// }

// Method2:
public class Reverse {
    public static void main(String[] args) {
        int n=3452;

        System.out.println(rev(n));
    }
    static int rev(int n){
       return helper(n,0);
    }
    static int helper(int n,int rev){
        if(n==0)
        return rev;

        int ld=n%10;
        rev=rev*10+ld;
        return helper(n/10, rev);
    }
}