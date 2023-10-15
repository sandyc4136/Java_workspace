class First
{
	void myFun()
	{
		System.out.println("myFun() of First");
	}
	
	void myFun(int a)	//overloaded method
	{
		System.out.println("myFun(int) of First");
	}
}

class Second extends First
{
	void myFun()			//Overriding method
	{
		System.out.println("myFun() of Second");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun() of Second");
	}
}
class Third extends First{
    void myFun(){
        System.out.println("myFun() of Third");
    }
}

class BindingDemo
{
	public static void main(String args[])
	{
		
		First f = new First();
		f.myFun();	//Dynamic binding
		f.myFun(5);	//static binding
		
		Second s = new Second();
		s.myFun();	//dynamic binding
		
		First f1 = new Second();
		f1.myFun();	//dynamic binding
        //f1.anotherFun(); // Error - cause anotherFun() does not belong to class First

        First  f2 = new Third();
		f2.myFun();
	}
}

