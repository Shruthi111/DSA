// Input a year and find whether it is a leap year or not.

// A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.

// For example,

// 1999 is not a leap year
// 2000 is a leap year
// 2004 is a leap year

import java.util.*;
public class leapyr{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the year");
        int yr=in.nextInt();

        if(yr%400==0)
        {
            System.out.println("Leap year");
        }
        else if(yr%100==0){
            System.out.println("Not a Leap year");
        }
        else if(yr%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}