// Given an array,implement 2 stacks using an array..and array should be efficiently used

public class imp_2stacks_in_an_array {
    public static void main(String[] args) {

        TwoStacks s=new TwoStacks();
        s.push1(5);
        s.push1(450);
        s.push1(50);
        s.push1(490);

        s.push2(67);
        s.push2(37);
        s.push2(7);
        s.push2(37);
        s.push2(07);

        while(s.top1>=0){
            System.out.println(s.pop1());
        }

        while(s.top2<s.arr.length){
            System.out.println(s.pop2());
        }

    }
}

class TwoStacks{
    int arr[]=new int[10];

    int top1=-1; 
    int top2=arr.length;

    void push1(int item){
        if(top1<top2-1){
            top1++;
            arr[top1]=item;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    void push2(int item){
        if(top1<top2-1){
            top2--;
            arr[top2]=item;
        }
        else{
            System.out.println("Stack Overflow");
        }
    } 

    int pop1(){
        
        if(top1==-1){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            int popped=arr[top1];
            top1--;
            return popped;
        }


    }
    int pop2(){
        
        if(top2==arr.length){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            int popped=arr[top2];
            top2++;
            return popped;
        }


    }
}

