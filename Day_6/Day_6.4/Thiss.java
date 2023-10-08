public class Thiss{
    public static void main(String args[]){
        Student stud1=new Student();
        stud1.printDetails();
        Student stud2= new Student(2, 67.34);
        stud2.printDetails();
    }
}
class Student{
    int roll;
    double marks;
    Student(){
        System.out.println("Zero constructor called");
        roll=-1;
        marks=0.0;
    }
    Student(int roll, double marks){
        System.out.println("2 argument constructor called");
        this.roll=roll; // instance roll=local roll
        this.marks=marks; // instance marks= local marks
    }
    void printDetails(){
        System.out.println(roll + "  " + marks);
    }
}
