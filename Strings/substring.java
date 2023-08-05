package Strings;

public class substring {
    public static void main(String[] args) {
        String s1="geeksforgeforeks";
        String s2="for";

        boolean flag=false;


        for(int i=0;i<=s1.length()-s2.length();i++){
            int j;
            for(j=0;j<s2.length();j++){
                if(s1.charAt(i+j)!=s2.charAt(j))
                break;
            }
            if(j==s2.length()){
                flag=true;

            // If we want to print position of the substring in main string
            // System.out.println(i);
            }


        }
        System.out.println(flag);
    }
}
