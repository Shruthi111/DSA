public class EvenNoDigits {
    public static void main(String[] args) {
        int arr[]={34,25,-67,8,1213,43};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(hasEvenNoDigits(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean hasEvenNoDigits(int n){
        if(n<0)
        n=n*-1;

        // 1st method
        
        // String str_n=String.valueOf(n);
        // if(str_n.length()%2==0)
        //   return true;

        // return false;

        // 2nd method

        // int count=0;
        // while(n>0){
        //     count++;
        //     n=n/10;
        // }
        // if(count%2==0)
        //   return true;

        // return false;

        // 3rd method:

        int count=(int)(Math.log10(n))+1;
        if(count%2==0)
        return true;

        return false;
    }
}
