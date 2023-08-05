import java.util.*;
public class hcf_lcm {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();

        int hcf=1;
        for(int i=1;i<=a || i<=b;i++ ){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }

        int lcm=(a*b)/hcf;
        System.out.println(hcf); 
        System.out.println(lcm); 
    }
}
