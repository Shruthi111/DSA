public class kstacks_in_array {
    public static void main(String[] args) {
        
    kstacks k=new kstacks();

    k.push(100,1);
    k.push(200,1);
    k.push(300,3);
    k.push(10,1);
    k.push(30,2);
    k.push(56,2);
    k.push(590,3);

    while(!k.isEmpty(1)){
        System.out.println(k.pop(1));
    }

    while((!k.isEmpty(2))){
        System.out.println(k.pop(2));
    }

    while(!k.isEmpty(3)){
        System.out.println(k.pop(3));
    }


    }
}
class kstacks{
    int arr[]=new int[6];

    int top[]={-1,-1,-1};

    int next[]={1,2,3,4,5,-1};

    int freespot=0,index;

    void push(int item,int stackNo){
        if(freespot==-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        index=freespot;

        freespot=next[index];

        arr[index]=item;

        next[index]=top[stackNo-1];

        top[stackNo-1]=index;

    }

    int pop(int stackNo){
        if(top[stackNo-1]==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=arr[top[stackNo-1]];

        index=top[stackNo-1];

        top[stackNo-1]=next[index];

        next[index]=freespot;

        freespot=index;

        return popped;

    }
    boolean isEmpty(int stackNo) {
        return top[stackNo - 1] == -1;
    }
}
