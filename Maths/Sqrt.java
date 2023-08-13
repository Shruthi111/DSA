// Time complexity:O(logn)
public class Sqrt {
    public static void main(String[] args) {
        int n=5;

        System.out.printf("%.3f",findSqrt(n,3));
    }
    static double findSqrt(int n,int p){
        int s=0;
        int e=n;

        double root=0;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(mid*mid==n)
                return mid;
            else if(mid*mid>n)
                e=mid-1;
            else 
            s=mid+1;
        }
        root= e;
        double inc=0.1;

        for(int i=1;i<=p;i++){
            while(root*root<=n)
                root+=inc;
                
            root= root-inc;
            inc/=10;
        }

        return root;
       
    }
}
