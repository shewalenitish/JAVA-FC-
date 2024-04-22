import java.util.*;
class Employee{
    private int id;
    private String name;
    private String department;
    private int salary;

    Employee(){
        this.id=0;
        this.name="";
        this.department="";
        this.salary=0;
    }
    Employee(int id,String name,String department,int salary){  //constructors==setters
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    //getters to access private members outside the class via this methods...
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDep(){
        return department;
    }
    public int getSal(){
        return salary;
    }
    void display(){
        
    }
}
class Manager extends Employee{
    private int bonus;
    Manager(int id,String name,String department,int salary,int bonus){
        super(id,name,department,salary); //invoking parent class constructor
        this.bonus=bonus;
    }
    public int total(){
        return getSal()+bonus;
    }
    public void display(){
       System.out.println("ID: "+getId());
       System.out.println("Name: "+getName());
       System.out.println("Department: "+getDep());
       System.out.println("Salary: "+getSal());
       System.out.println("Bonus: "+bonus);
       System.out.println("Total(salary+bonus): "+total());
    }
}
public class First {
   public static void main(String[] args) {
   int max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many Managers: ");
    int n=sc.nextInt();
    Manager m[]=new Manager[n]; //array of object to create n number of object
    for(int i=0; i<n;i++){
        System.out.println("Enter information for "+i+1+"manager");
        System.out.println("Enter id: ");
        int id=sc.nextInt();
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter department: ");
        String dep=sc.next();
        System.out.println("Enter salary: ");
        int sal=sc.nextInt();
        System.out.println("Enter the bonus: ");
        int bonus=sc.nextInt();

        m[i]=new Manager(id,name,dep,sal,bonus);
    }
    for(int i=0; i<n-1; i++){ //calculating manager with max salary+bonus
        if(m[i].total()>m[i+1].total()){
            max=i;
        }
    }
    m[max].display();
   }
}
