import java.io.*;
import java.util.*;
class MyNumber{
  private int num;
  MyNumber()
  {
    this.num=0;
  }
  MyNumber(int num){
    this.num=num;
  }
  public void check()
  {
    if(num>0){
        System.out.println("positive");
    }
    else if(num<0){
        System.out.println("neg");

    }
    else {
        System.out.println("zero");
    }

    if(num%2==0){
        System.out.println("even");
    }
    else  
       System.out.println("odd");
}
}
public class Second {
    public static void main(String[] args) {

        int res=Integer.parseInt(args[0]);
        MyNumber obj=new MyNumber(res);
        obj.check();

        /*
        -------For more than one arguments--------->
        for(int i=0; i<args.length; i++)
        {
            int res=Integer.parseInt(args[i]);//converting args[i](String) to intger and storing it in variable "value"
            MyNumber obj[]=new MyNumber[args.length];
            obj[i]=new MyNumber(res);
            obj[i].check();
        }*/
        
    }
}

