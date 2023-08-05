
public class Tri {
    public static void main(String[] args) {
        printTri(5);
    }
    static void printTri(int n){
        handler(n,1);
    }
    static void handler(int r,int c){
        if(r==0)
        return;

        if(c<=r)
        {
            handler(r, c+1);
            System.out.print("* ");
        }
        else{
            handler(r-1, 1);
            System.out.println();
        }
    }
}
