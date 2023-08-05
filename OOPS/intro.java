public class intro{
    public static void main(String[] args) {
        
        Student s=new Student();
        Student s1=new Student("Shruthi",90,234);
        // System.out.println(s);

        // s.name="Shruthi";
        // s.rno=78;
        // s.marks=99;

        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.marks);

          System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);

    }

}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno=10;
        this.name="Ana";
        this.marks=0;
    }

    Student(String name,int rno,float marks){
        this.rno=100;
        this.name="Ananya";
        this.marks=78;
    }
}