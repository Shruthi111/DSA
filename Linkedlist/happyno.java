public class happyno {
    public static void main(String[] args) {

        System.out.println(isHappy(2));
        
    }
    static boolean isHappy(int n) {
                int sum=0;
        
                while(n!=1 && n!=4){
                    sum=0;
                    while(n>0){
                        int ld=n%10;
                        sum+=ld*ld;
                        n=n/10;
                    }
        
                    n=sum;
                }
        
                if(sum==1)
                return true;
                else 
                return false;
        
            }
}
