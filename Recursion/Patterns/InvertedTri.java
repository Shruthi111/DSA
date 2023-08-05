

public class InvertedTri{
    public static void main(String[] args) {
        printInvertedtri(5);
    }
    static void printInvertedtri(int n){
        handler(n,1);
    }
    static void handler(int r,int c){

        if (r==0)
        return;

        if(c<=r){
        System.out.print("* ");
        handler(r, c+1);
        }
        else
        {
        System.out.println();
        handler(r-1, 1);
        }
    }
}