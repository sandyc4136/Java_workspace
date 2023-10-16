

public class ImplementExtendsAnother {
    public static void main(String args[]){
        Demo d1=new Demo();
        d1.myFun1();
        d1.myFun2();
    }

}
interface MyInterface1{
    void myFun1();
}
interface MyInterface2 extends MyInterface1{
    void myFun2();
}
class Demo implements MyInterface2{
    public void myFun1(){
        // codde
        System.out.println("myFun1() of MyInterface1");
    }
    public void myFun2(){
        // code
          System.out.println("myFun2() of MyInterface2");
    }
}
