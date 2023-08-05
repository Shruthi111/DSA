import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
         List<Integer> ans;
         ans=findAllDuplicateNos(arr);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> findAllDuplicateNos(int arr[]){
        int i=0;
        while(i<arr.length){
            int crtIdx=arr[i]-1;

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
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1)
            ans.add(arr[j]);
        }
        return ans;
    }
}
