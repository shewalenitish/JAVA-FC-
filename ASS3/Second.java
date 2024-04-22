import java.util.*;
abstract class Shape{
     abstract void area();
     abstract void volume();
}
class Sphere extends Shape{
     int r;
     Sphere(int r){
        this.r=r;
     }
     void area(){
       System.out.println(4*3.14*r*r);
     }
     void volume(){
        System.out.println((4/3)*3.14*(r*r*r));
     }
}

class Cone extends Shape{
    int r;
    int h;
    Cone(int r,int h){
    this.r=r;
    this.h=h;
    }
    void area(){
       System.out.println( Math.sqrt(r*r+h*h));
    }
    void volume(){
        System.out.println((3.14*r* r*r) / 3.0);
    }
}

class Cylinder extends Shape{
        int r,h;
        Cylinder(int r,int h){
            this.r=r;
            this.h=h;
        }
        void area(){
           System.out.println((2*3.14*r*h)+(2*3.14*r*r));
        }
        void volume(){
            System.out.println(3.14*(r*r)*h);
        }
    }

class Box extends Shape{
    int length;
    int width;
    int height;
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void area(){
        System.out.println(length*width+width* height+height*length);
    }
    void volume(){
        System.out.println(length*width*height);
    }
}

public class Second {
    public static void main(String[] args) {
        Shape obj=new Sphere(4);//what to access on left side which version of it on the right side
                                  //dynamic dispatch and runtime polymorphism
        obj.area();

        Shape c=new Cone(23,33);
        c.volume();
    }
    
}
