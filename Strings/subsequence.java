package Strings;

public class subsequence {
    public static void main(String[] args) {
           
    String s1="geeksforgeeks";
    String s2="grgesk";

    int i=0;
    int j=0;

    while(i<s1.length() & j<s2.length()){
        if(s1.charAt(i)==s2.charAt(j)){
            i++;
            j++;
        }
        else
        i++;
    }
        
    
    

    if(j==s2.length())
    System.out.println("true");
    else
    System.out.println("false");
}

}
