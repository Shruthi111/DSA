import java.util.Arrays;

// public class MissingNo {
//     public static void main(String[] args) {
//         int arr[]={9,6,4,2,3,5,7,0,1};
//         System.out.println(findMissingno(arr));
//     }
//     static int findMissingno(int arr[]){
//         int i=0;
//         while(i<arr.length){
//             int crtIdx=arr[i];

//             if(arr[i]!=arr.length && arr[i]!=arr[crtIdx])
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[crtIdx];
//                 arr[crtIdx]=temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]!=j)
//             return j;
//         }
//         return arr.length;
//     }
// }

// public class MissingNo {
//     public static void main(String[] args) {
//         int arr[]={4,3,2,7,8,5,0,1};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }

//         int actual_sum=arr.length*(arr.length+1)/2;

//         System.out.println(actual_sum-sum);

//     }
    
// }

public class MissingNo {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,5,0,1};
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            sum^=i;
            if(i<arr.length)
            sum^=arr[i];
        }

        System.out.println(sum);

    }
    
}