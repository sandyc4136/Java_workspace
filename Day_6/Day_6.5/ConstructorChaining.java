public class ConstructorChaining {
    public static void main(String args[]){
        // new Student(-1).printDetails();
        new Student(2, 67.89).printDetails();
    }
}
class Student{
    int roll;
    double marks;
    Student(){
        roll=1;
        marks=1.0;
        System.out.println("Student() called ");
       System.out.println(this.roll + "  " + this.marks); 
    }
    Student(int roll){
        this();
        this.roll=roll;
        System.out.println("Student(int roll) called ");
       System.out.println(this.roll + "  " + this.marks);
    }
    Student(int roll, double marks){
        this(roll);
        this.marks=marks;
        System.out.println("Student(int roll, double marks) called");
        System.out.println(this.roll + "  " + this.marks);
    }
    void printDetails(){
        System.out.println("Roll = " + this.roll);
       System.out.println("marks = " + this.marks); 
    }
}
