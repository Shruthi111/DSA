public class Prime{
    public static void main(String[] args) {
        int n=13;
        boolean flag=true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {flag=false;
            break;
            }

        }
        if(flag==true)
        System.out.println("Prime");
        else 
        System.out.println("Not prime");

    }
}