import java.util.*;

public class ClassesAndObjects {
    public static void main(String args[]){
        Student std=new Student();
        System.out.println(std.Rollno + " ");
        System.out.println(std.age + " ");
        System.out.println(std.marks + " ");
        std.Rollno=1;
        std.age=22;
        std.marks=34.78;
        System.out.println(std.Rollno + " ");
        System.out.println(std.age + " ");
        System.out.println(std.marks + " ");       
}
}
class Student{
    int Rollno;
    int age;
    double marks;
}
