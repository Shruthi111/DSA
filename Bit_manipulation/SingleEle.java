public class SingleEle {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,4};
        int ans=0;
        for(int ele:arr)
        ans=ans^ele;

        System.out.println(ans);
    }
}
