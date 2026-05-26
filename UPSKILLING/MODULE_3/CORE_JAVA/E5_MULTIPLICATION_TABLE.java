package UPSKILLING.MODULE_3.CORE_JAVA;
import java.util.*;
public class E5_MULTIPLICATION_TABLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table Number: ");
        int num=sc.nextInt();
        System.out.println("The Multiplication Table for ");
        for(int i =1;i<=10;i++){
            int ans=i*num;
            System.out.println(i+" X "+ num + " = "+ans);
        }
    }
    
}
