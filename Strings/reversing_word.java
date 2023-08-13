// public class reversing_word {
//     public static void main(String[] args) {
//         String sentence="geeks for students";
//         String words[]=sentence.split(" ");

//         for(int i=0;i<=words.length/2;i++){
//             String temp=words[i];
//             words[i]=words[words.length-i-1];
//             words[words.length-i-1]=temp;
//         }

//         sentence=String.join(" ",words);
//         System.out.println(sentence);

//     }
// }

public class reversing_word {
    public static void main(String[] args) {
        String sentence="geeks for students";
        char arr[]=sentence.toCharArray();

        int start=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        reverse(arr,start,arr.length-1);
        reverse(arr,0,arr.length-1);

        sentence=new String(arr);
        System.out.println(sentence);
    }

    static void reverse(char arr[],int start,int end){
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
