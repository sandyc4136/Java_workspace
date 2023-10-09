

public class StaticMethod {
    public static void main(String args[]){
        Demo.increment();
        Demo d1=new Demo();
        d1.increment();
    }
}
class Demo{
    int a,b;
    static int c;
    static void increment(){
        c++;
        System.out.println(c);
        System.out.println(a);// Error : Static method can only access static data member
    }
}
