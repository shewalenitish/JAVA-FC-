import Prime.*;
import Perfect.*;
import Armstrong.*;
import java.util.*;

import Armstrong.armstrong;
public class check {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many elements");
       int no=sc.nextInt();
       for(int i=0; i<no; i++)
       {
        System.out.println("Enter the digit");
        int n=sc.nextInt();
        primeNo obj=new primeNo(n);
        obj.isPrime();
        
        perfect p=new perfect(n);
        p.isPerfect();

        armstrong a=new armstrong(n);
        a.isArm();
       }
       

       

    }
    
}
