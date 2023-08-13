package Strings;

// public class substring {
//     public static void main(String[] args) {
//         String s1="geeksforgeforeks";
//         String s2="for";

//         boolean flag=false;

//         for(int i=0;i<=s1.length()-s2.length();i++){
//             int j;
//             for(j=0;j<s2.length();j++){
//                 if(s1.charAt(i+j)!=s2.charAt(j))
//                 break;
//             }
//             if(j==s2.length()){
//                 flag=true;

//             // If we want to print position of the substring in main string
//             // System.out.println(i);
//             }


//         }
//         System.out.println(flag);
//     }
// }


// Optimized (Only in case where all the char of pattern is distinct)

public class substring {
    public static void main(String[] args) {
        String s1="abcdabcde";
        String s2="bcde";

        if(s1.indexOf(s2, 0)!=-1)
        System.out.println(true);
        else
        System.out.println(false);

        // boolean flag=false;

        // for(int i=0;i<=s1.length()-s2.length();){
        //     int j;
        //     for(j=0;j<s2.length();j++){
        //         if(s1.charAt(i+j)!=s2.charAt(j))
        //         break;
        //     }
        //     if(j==s2.length())
        //         flag=true;

        //     if(j==0)
        //     i++;
        //     else
        //     i=i+j;

        //     // If we want to print position of the substring in main string
        //     // System.out.println(i);
            


        // }
        // System.out.println(flag);
    }
}