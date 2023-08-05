import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double cur_in_rs=in.nextDouble();

        double cur_in_usd=cur_in_rs*0.012;
        System.out.println(cur_in_usd);
    }
}
