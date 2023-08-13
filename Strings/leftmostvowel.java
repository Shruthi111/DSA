import java.util.Arrays;

public class leftmostvowel {
    public static void main(String[] args) {
        String name="Shruthi";

        char vowel[]={'a','e','i','o','u'};
        name=name.toLowerCase();

        for(int i=0;i<name.length();i++){
            for(int j=0;j<vowel.length;j++){
                if(name.charAt(i)==vowel[j]){
                    System.out.println(i);
                    return;
                }

            }
        }

        System.out.println(-1);

    }
}
