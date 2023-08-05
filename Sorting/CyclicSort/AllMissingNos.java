import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNos {
    public static void main(String[] args) {
         int arr[]={9,6,4,2,3,3,7,2,1};
         List<Integer> ans;
         ans=findAllMissingNos(arr);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> findAllMissingNos(int arr[]){
        int i=0;

        while(i<arr.length){
            int crtIdx=arr[i]-1;
            if(arr[i]!=arr.length && arr[i]!=arr[crtIdx]){
                int temp=arr[i];
                arr[i]=arr[crtIdx];
                arr[crtIdx]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
