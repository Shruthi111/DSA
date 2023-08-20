public class unique2_nos{
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,1,2,7};

        int xorsum=0;

        for(int i=0;i<arr.length;i++){
            xorsum=xorsum^arr[i];
        }

        int pos=getRightmostSetBit(xorsum);
        int newxor=0;

        for(int i=0;i<arr.length;i++){
            if(getBit(arr[i],pos)==1)
            newxor^=arr[i];
        }

        System.out.println(newxor);
        System.out.println(xorsum^newxor);


    }

    static int getRightmostSetBit(int n){
        int setBit=0;
        int pos=0;

        while(setBit!=1){
            setBit=n&1;
            pos++;
            n>>=1;
        }

        return pos-1;
    }

    static int getBit(int n,int pos){
        n=n>>pos;

        return n & 1;
    }
}