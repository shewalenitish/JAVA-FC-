import java.util.*;
abstract class Staff{
     String name;
     String address;
     abstract void display();
     public Staff(String name,String address){
        this.name=name;
        this.address=address;
     }
     
}
class FullTime extends Staff{
       String department;
       int salary;
       public FullTime(String name,String address,String department,int salary){
         super(name,address);
         this.department=department;
         this.salary=salary;
       }
       public void display(){
            System.out.println("name: ..."+name);
            System.out.println(address);
            System.out.println(department);
            System.out.println(salary);
       }
}
class PartTime extends Staff{
       int NoOfHours;
       int ratePerH;
       public PartTime(String name,String address,int NoOfHours,int ratePerH){
        super(name, address);
        this.NoOfHours=NoOfHours;
        this.ratePerH=ratePerH;
       }
       void display(){
           System.out.println("name: ..."+name);
           System.out.println(address);
           System.out.println(NoOfHours);
           System.out.println(ratePerH);
       }
}
public class Third{
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of members: ");
        int n=sc.nextInt();
        Staff s[]=new Staff[n];
        for(int i=0; i<n; i++){
          System.out.println("Enter your choice");
          System.out.println("1.Full Time");
          System.out.println("2.Part Time");
          int choice=sc.nextInt();

          System.out.println("Enter name");
          String name=sc.next();
          System.out.println("Enter address");
          String add=sc.next();

          if(choice==1){
            System.out.println("Enter department");
            String dep=sc.next();
            System.out.println("Enter Salary");
            int sal=sc.nextInt();
            
             s[i]=new FullTime(name,add,dep,sal);
          }
          else{
            System.out.println("Enter NO of hours");
            int hour=sc.nextInt();
            System.out.println("Enter Rate per hour");
            int rate=sc.nextInt();
            
             s[i]=new PartTime(name,add,hour,rate);
          }
        }
        for(int i=0; i<n; i++){
            s[i].display();
        }

      }
}