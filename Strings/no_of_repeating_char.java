// Finding no of repeating characters in a string :Maventic ques1

public class no_of_repeating_char {
    public static void main(String[] args) {
        String s="necessarrry";

        int freq[]=new int[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            freq[(s.charAt(i)+32)-'a']++;
            else
            freq[(s.charAt(i))-'a']++;
        }

        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println((char)(i+'a'));
                count++;
            }
        }

        System.out.println(count);
    }
}
