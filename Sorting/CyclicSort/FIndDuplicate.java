public class FIndDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(findDuplicateno(arr));
    }
    static int findDuplicateno(int arr[]){
        int i=0;
        while(i<arr.length){
            int crtIdx=arr[i];

            if(arr[i]!=arr[crtIdx])
            {
                int temp=arr[i];
                arr[i]=arr[crtIdx];
                arr[crtIdx]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j)
            return arr[j];
        }
        return -1;
    }
}
