package UPSKILLING.MODULE_3.CORE_JAVA;
import java.util.*;
public class D4_LEAP_YEAR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            } 
        }
        else{
        System.out.println("Not a Leap Year");
        }
        //or 
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Leap Year");

        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
