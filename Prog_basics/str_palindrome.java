import java.util.Scanner;

// To find out whether the given String is Palindrome or not.

// public class str_palindrome {
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);

//         String s=in.next();
//         char arr[]=s.toCharArray();
//         boolean flag=true;

//         int k=arr.length-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=arr[k]){
//                 flag=false;
//             }
//             k--;
//         }
//         if(flag==true){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not Palindrome");

//         }
//     }
// }


// public class str_palindrome {
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);

//         String s=in.next();
//         boolean flag=true;

//         for(int i=0;i<=s.length()/2;i++){
//            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
//             flag=false;
//             break;
//            }
//         }
        
//         if(flag==true){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not Palindrome");

//         }
//     }
// }


public class str_palindrome {
    public static void main(String[] args) {

        int stack[]={1,0,6};
        boolean flag=true;

        int top=2;
        int i=top,k=0;

        while(i!=top/2){
            if(stack[i]!=stack[k]){
                flag=false;
                break;
            }
            i--;
            k++;
        }

        
        if(flag==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}


