public class DefaultConstr{
    public static void main(String args[]){
        // Student stud2=new Student(2, 56.34);
        // stud2.printDetails();
        // Student stud1=new Student(); // Error in compilation as no default constructor or zero consturctor
        // stud1.printDetails();
        Student arr[]=new Student[4];
        arr[0]= new Student(3, 56.44);
        arr[0].printDetails();

        // for(int i=0;i<4;i++)
        // arr[i].printDetails();

    }
}
// class Student{
//     int roll;
//     double marks;
//     void printDetails(){
//         System.out.println(roll + "  " + marks);
//     }
// }

class Student{
    int roll;
    double marks;
    Student(){
    roll=0;
    marks=0.00;

    }
    Student(int a , double b){
        roll=a;
        marks=b;
    }
    void printDetails(){
        System.out.println(roll + "  " + marks);
    }
}