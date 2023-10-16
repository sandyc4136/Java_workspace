

public class MultipleInterfaceDemo {
    public static void main(String args[]){
        Demo d1= new Demo();
        d1.myFun1();
         d1.myFun2();
          d1.myFun3();
    }
}
interface MyInterface1
{
	void myFun1();
	// void fun1();
	
}

interface MyInterface2
{
	void myFun2();
	// void fun2();
}

interface MyInterface3 extends MyInterface1,MyInterface2
{ 
    void myFun3();
    
}
class Demo implements MyInterface3
{
	//It will have to implement three methods - myFun(),fun1() and fun2().
    public void myFun1(){
        // codde
        System.out.println("myFun1() of MyInterface1");
    }
    public void myFun2(){
        // code
          System.out.println("myFun2() of MyInterface2");
    }
    public void myFun3(){
         System.out.println("myFun3() of MyInterface3");
    }
}






