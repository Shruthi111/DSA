public class MaxWealth {
    public static void main(String[] args) {
         int arr[][]={{1,45,67},
                    {423,3,1},
                    {678,33,90}
                    };
        System.out.println(findMaxWealth(arr));
    }
    static int findMaxWealth(int arr[][]){

        int maxWealth=0;

        for(int person=0;person<arr.length;person++){
                    int sum=0;
            for(int account=0;account<arr[person].length;account++){
                sum+=arr[person][account];
            }
            if(sum>maxWealth)
            maxWealth=sum;
        }

        return maxWealth;
    }
}
