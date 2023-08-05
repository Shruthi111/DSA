public class CharSearch {
    public static void main(String[] args) {
        String name="shruthi";
        char target='u';

        System.out.println(getSearchIndex(name,target));
    }
    static int getSearchIndex(String name,char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
