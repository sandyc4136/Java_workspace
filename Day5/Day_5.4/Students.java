public class Students {
    public static void main(String args[]){
        Student std1=new Student();
        Student std2=new Student();

        std1.getDetails(1, 21, 98.89);
        std2.getDetails(2, 22, 65.32);

        std1.printDetails();
        std2.printDetails();
    }
}
class Student{
    int Rollno;
    int age;
    double marks;
    public void getDetails(int r, int a, double m){
        Rollno=r;
        age=a;
        marks=m;
    }
    public void printDetails(){
        System.out.println(Rollno);
        System.out.println(age);
        System.out.println(marks);
    }
}