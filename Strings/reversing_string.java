public class reversing_string {
    public static void main(String[] args) {
        String a="apple";
        char chara[]=a.toCharArray();

        for(int i=0;i<=chara.length/2;i++){
            char temp=chara[i];
            chara[i]=chara[chara.length-i-1];
            chara[chara.length-i-1]=temp;
        }

        String converted=new String(chara);
        System.out.println(converted);
    }
}
