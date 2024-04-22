import MScCAI.*;
import MScCAII.*;

public class Student{
    int roll;
    String name;
    MScIMarks mscImarks;
    MScCAIIMarks mscIImarks;

    Student(int roll,String name,MScIMarks mscImarks,MScCAIIMarks mscIImarks){
     this.roll=roll;
     this.name=name;
     this.mscImarks=mscImarks;
     this.mscIImarks=mscIImarks;
    }
    public int total(){
        return mscImarks.SemITotal+mscImarks.SemIITotal+mscIImarks.SemITotal+mscIImarks.SemIITotal;
    }
    public void display(){
        System.out.println("roll: "+roll);
        System.out.println("name: "+name);
         System.out.println("Total marks: "+total());
         if(total()>=70)
         {
            System.out.println("Grade: A");
         }
         else if(total()>=60 && total()<70)
         {
            System.out.println("Grade: B");
         }
         else if(total()>=50 && total()<60)
         {
            System.out.println("Grade: C");
         }
         else if(total()>=40 && total()<50)
         {
            System.out.println("Grade: Pass");
         }
         else
           System.out.println("Fail");
    }
    public static void main(String[] args){
        MScIMarks stud=new MScIMarks(10, 6);
        MScCAIIMarks stude=new MScCAIIMarks(12, 12);
        Student s1=new Student(12,"nitish",stud,stude);
        s1.display();
    }
 
}
