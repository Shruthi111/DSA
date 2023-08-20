package Strings;

import java.util.Arrays;
import java.util.Collections;

//1. Converting a string to uppercase or lowercase
// public class Basics {
//     public static void main(String[] args) {
//         String name="Shruthi";

//         // System.out.println(name.toUpperCase());
//         // System.out.println(name.toLowerCase());

//         // Without using builtin functions
//         char nameArr[]=name.toCharArray();

//         for(int i=0;i<nameArr.length;i++){
//             if(nameArr[i]>='a' && nameArr[i]<='z')
//             nameArr[i]-=32;

//             // if(nameArr[i]>='a' && nameArr[i]<='z')
//             // nameArr[i]-=32;
//         }



//         name=new String(nameArr);

//         System.out.println(name);

//     }
// }

// 2.Form a smallest number from a given numerical string
// public class Basics {
//     public static void main(String[] args) {
//         String name="53792057425";
//         char nameArr[]=name.toCharArray();

//         Arrays.sort(nameArr);

//         System.out.println(new String(nameArr));

//     }
// }

// 3.Maximum occuring character in a string
public class Basics {
    public static void main(String[] args) {
        String name="sjfskfjkaffj";
        
        int freq[]=new int[26];

        for(int i=0;i<name.length();i++){
            freq[name.charAt(i)-'a']++;
        }

        int max=0;
        char c='a';
        for(int i=0;i<freq.length;i++){
            max=Math.max(max,freq[i]);
            c=(char) (i+'a');
        }

        System.out.println(max+" "+c);
    }
}

