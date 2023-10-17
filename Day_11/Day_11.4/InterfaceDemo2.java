import java.util.concurrent.SynchronousQueue;

public class InterfaceDemo2 {
    public static void main(String args[]){
        Third t=new Third();
        t.fun1();
        t.myFun1();
        t.fun2();
        t.myFun3();
    }
}
interface MyInterface1{
    void fun1();
}
interface MyInterface2{
    void fun2();
}
class First{
    void myFun1(){
        System.out.println("myFun() of class FIrst");
    }
}
class Second extends First implements MyInterface1,MyInterface2{
   public void fun1(){
         System.out.println("fun1() of class Second");
    }
    public void fun2(){
         System.out.println("fun2() of class Second");
    }
}
class Third extends Second{
    void myFun3(){
        System.out.print("myFun3() of Third");
    }
}

