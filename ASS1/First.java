import java.util.*;
class Employee{
    String name,postion;
    int salary;
    static int count=0;  //static bcz only one copy of count for every object.
    Employee() //default
    {
        this.name="Sarvesh";
        this.postion="HR";
        this.salary=15000;
        
    }
    Employee(String name,String position,int salary)
    {
        this.name=name;
        this.postion=position;
        this.salary=salary;
        count++;   //will increment whenever constructor gets invoke
    }
    public void display()//parametarized
    {
        System.out.println(name);
        System.out.println(postion);
        System.out.println(salary);
        System.out.println(count);
    }
    public String toString() {
       
        return "name: "+name+ " pos: "+postion+ " sal: "+salary+"count: "+count;
    }   
}
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of objects");
        int n=sc.nextInt();
        Employee obj[]=new Employee[n];  //n number of objects

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter information name position salary");
            String name=sc.next();
            String position=sc.next();
            int salary=sc.nextInt();
             obj[i]=new Employee(name,position,salary);
             obj[i].display();
             
             System.out.println(obj[0]);
        }
       
    }
}
