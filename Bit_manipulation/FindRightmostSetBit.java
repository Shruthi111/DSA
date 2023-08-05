// public class FindRightmostSetBit {
//     public static void main(String[] args) {
//         int n=6;
//         int bit=1;
//         int pos=1;

//         int neg_n=~n+1;
//         int result=n & neg_n;

//         while(result!=bit)
//         {
//             pos+=1;
//             bit<<=1;
//         }

//         System.out.println(pos);
//     }
// }

public class FindRightmostSetBit {
    public static void main(String[] args) {
        int n=6;
        int pos=1;
        int mask=1;

        while((n&mask)==0)
        {
            pos++;
            mask=mask<<1;
        }

        System.out.println(pos);
    }
}

