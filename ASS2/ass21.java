import numoperation.*;
import java.util.*;
import java.util.Scanner;

public class ass21 { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++){
            System.out.println("enter a number");
            int n=sc.nextInt();

            prime p=new prime(n);
            p.isPrime();

            perfect p1=new perfect(n);
            p1.isPerfect();


        }

    }
    
}
