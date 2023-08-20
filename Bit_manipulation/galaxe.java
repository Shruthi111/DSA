import java.util.Arrays;

public class galaxe {
    public static void main(String[] args) {
        int arr[]={2001097219,1234567896,1123456543,2017362511};

        // int n=2001097219;
        // System.out.println(n);
        
        int max=findMax(arr);
        int maxn=(int)(Math.log(max)/Math.log(2))+1;
        // System.out.println(maxn);

        int f[]=new int[maxn];


        for(int i=0;i<arr.length;i++){
            int pos=0;
            while(pos<maxn){
                // System.out.println(getBit(arr[i],pos));
                f[pos]+=getBit(arr[i],pos);
                pos++;
            }
        }
        System.out.println(Arrays.toString(f));
        System.out.println(findMax(f)); 
    }

    static int getBit(int n,int pos){
        return (n>>pos)&1;
    }

    static int findMax(int arr[]){
        int max=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }

        return max;
    }
}
