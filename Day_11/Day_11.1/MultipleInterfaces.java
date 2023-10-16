
interface MyInterface1
{
	 void fun1();
}

interface MyInterface2
{
	 void fun2();
}

 class Demo implements MyInterface1,MyInterface2
{

//we will have to override fun1() and fun2() here in this class.
    public void fun1(){
        System.out.println("fun1() of MyInterface 1");
    }
	public void fun2(){
        System.out.println("fun2() of MyInterface 2");
    }
}
public class MultipleInterfaces{
    public static void main(String args[]){

        Demo d1=new Demo();
         d1.fun1();
         d1.fun2();
    }
}