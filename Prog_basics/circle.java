// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.


import java.util.*;

public class circle{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        final double pi=3.142;

        System.out.println("Enter the radius");
        double radius=in.nextDouble();

        double area=pi*radius*radius;
        double circum=2*pi*radius;

        System.out.println("Area= "+area);
        System.out.println("Circumference= "+circum);


    }
}