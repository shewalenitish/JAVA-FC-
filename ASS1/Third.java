import java.util.*;
class Student{
    int roll;
    String name;
    float per;
    Student()
    {
        this.roll=0;
        this.name="";
        this.per=0f;
    }
    Student(int roll, String name, float per)
    {
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    @Override
    public String toString()//Overridden
    {
        return "  roll:"+roll+"  name:"+name+"   per"+per;
    }
}
public class Third{
    public static void sortStudent(Student obj[],int n)
    {
          for(int i=0; i<n-1; i++)
          {
            if(obj[i].per>obj[i+1].per)//sort in ascending order
            {
               Student temp=obj[i+1];//we want to store obj thats why "temp" is of type "Student"
               obj[i+1]=obj[i];
               obj[i]=temp;
            }
               
          }
          for(int i=0; i<n; i++){
                                        //System.out.println method by default calls toString method
            System.out.println(obj[i]); //this implicitly calls toString method if overridden it will call that one
          }
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many objects");
        int n=sc.nextInt();

        Student obj[]=new Student[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter roll");
            int roll=sc.nextInt();
            System.out.println("enter name");
            String name=sc.next();
            System.out.println("enter per");
            float per=sc.nextFloat();
            obj[i]=new Student(roll,name,per);
        }
        sortStudent(obj, n);
    }
}