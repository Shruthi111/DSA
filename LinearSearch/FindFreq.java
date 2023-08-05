public class FindFreq {
    public static void main(String[] args) {
        int arr[]={ 3, 2, 7, 2, 4, 2, 9};
        int target=2;

        System.out.println(getFreq(arr,target));
    }
    static int getFreq(int arr[],int target){
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                freq++;
            }
        }
        return freq;
    }
}

