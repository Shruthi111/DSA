// Time Complexity:Worst case:O(n),best case:O(1)

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int target=in.nextInt();

        System.out.println(getSearchIndex(arr,target));
    }
    static int getSearchIndex(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
}