
public class StaticAndNonStatic {
    public static void main(String args[]){
        Demo.c=2;
        System.out.println("Static c = " + Demo.c);
        Demo d1=new Demo(2,3);
        d1.increment();
        d1.printDetails();
        Demo d2=new Demo(4,5);
        d2.increment();
        d2.printDetails();
        Demo d3=new Demo(6,7);
        d3.increment();
        d3.printDetails();
    }
}
class Demo{
    int a;
    int b;
    static int c;
    Demo(){

    }
    Demo(int a, int b){
        this.a=a;
        this.b=b;

    }
    void increment(){
        c++;
    }
    void printDetails(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}