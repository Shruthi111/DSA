public class FindMaxMin {
    public static void main(String[] args) {
        int arr[]={34,25,67,8,1213,43};

        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
    static int getMax(int arr[]){
        int max=arr[0];
        for(int ele:arr){
            if(ele>max)
            max=ele;
        }
        return max;
    }
    static int getMin(int arr[]){
        int min=arr[0];
        for(int ele:arr){
            if(ele<min)
            min=ele;
        }
        return min;
    }
}
