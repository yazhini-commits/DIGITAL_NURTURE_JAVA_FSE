package UPSKILLING.MODULE_3.CORE_JAVA;
import java.util.*;
public class B2_SIMPLE_CALCULATOR {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number-1: ");
    int num1=sc.nextInt();
    System.out.println("Enter Number-2: ");
    int num2 = sc.nextInt();
    System.out.println("Choose the Operator\n1. Addition \n2. Subtraction \n3. Product \n4. Division");
    int op=sc.nextInt();
    switch(op){
        case 1:
            System.out.println("The Sum of two numbers is: "+(num1+num2));
            break;
        case 2:
            int max=num1>num2?num1:num2;
            int min=num1<num2?num1:num2;
            System.out.println("The Difference of two numbers is: "+(max-min));
            break;
        case 3:
            System.out.println("The Product of two numbers is: "+(num1*num2));
            break;
        case 4:
            if(num2==0){
                System.out.println("The Denominator cannot be zero");
            }
            else{
            System.out.println("The Division of two numbers is: "+(num1/num2));
            }
            break;
        default:
            System.out.println("Please Choose the valid Option");
    }
    }
}
