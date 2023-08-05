// Time complexity:O(n^2)

// public class histogram {
//     public static void main(String[] args) {
//         int arr[]={2,1,2};

//         int max=0;

//         for(int i=0;i<arr.length;i++){
//             int j=i;
//             int larea=0,rarea=0;

//             // left check
//             while(j>=0 && arr[j]>=arr[i]){
//                 larea+=arr[i];
//                 j--;
//             }
            
//             j=i+1;
//             // right check
//             while(j<=arr.length-1 && arr[j]>=arr[i]){
//                 rarea+=arr[i];
//                 j++;
//             }

//             max=Math.max(max,larea+rarea);
//         }

//         System.out.println(max);
//     }
// }


// Optimized approach using stack

import java.util.Stack;

public class histogram {
    public static void main(String[] args) {
        int arr[]={2,2,2,2,2};

        int max=0;

        int previdx[]=findPrevSmallerEle(arr);
        int nextidx[]=findNextSmallerEle(arr);

        for(int i=0;i<arr.length;i++){
            int l=arr[i];
            int b;
            int area;

            if(nextidx[i]==-1){
                nextidx[i]=arr.length;
            }
            
            b=nextidx[i]-previdx[i]-1;
            area=l*b;
            
            max=Math.max(max, area);
        }

        System.out.println(max);
    }

    static int[] findPrevSmallerEle(int arr[]){
        Stack<Integer> stack=new Stack<>();

        stack.push(-1);
        int ans[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(stack.peek()!=-1 && arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            ans[i]=stack.peek();
            stack.push(i);


        }

        return ans;


    }

     static int[] findNextSmallerEle(int arr[]){
        Stack<Integer> stack=new Stack<>();

        stack.push(-1);
        int ans[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(stack.peek()!=-1 && arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            ans[i]=stack.peek();
            stack.push(i);


        }

        return ans;


    }
}
