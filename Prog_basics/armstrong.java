import java.util.Scanner;

public class armstrong {

    public static boolean isarmstrong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld, 3);
            n=n/10;
        }

        if(temp==sum){
            return true;
        }
        else{
           return false;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        for(int i=a;i<=b;i++){
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }


        
    }
}
