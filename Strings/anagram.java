import java.util.Arrays;

// public class anagram {
//     public static void main(String[] args) {
//         String a="listen";
//         String b="silenti";

//         char ac[]=a.toCharArray();
//         char bc[]=b.toCharArray();

//         Arrays.sort(ac);
//         Arrays.sort(bc);

//         if(Arrays.equals(ac,bc))
//         System.out.println(true);
//         else
//         System.out.println(false);
//     }
// }

public class anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";

        if(a.length()!=b.length())
        {
            System.out.println(false);
            return;
        }


        int count[]=new int[256];

        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        boolean flag=true;

        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            flag=false;
        }

        System.out.println(flag);
    }
}