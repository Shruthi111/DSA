public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={4,56,2,13,890};

        System.out.println(search(arr,890));
    }
    static int search(int arr[],int target){
        return helper(arr,target,0);
    }
    static int helper(int arr[],int target,int i){
        if(i==arr.length)
        return -1;

        if(target==arr[i])
        return i;

        return helper(arr, target, i+1);
    }
}
