class Demo
{
	void myFun(int a)
	{
		//this();			//ERROR as myFun() is not a constructor method.
		System.out.println("myFun(int) called");
		this.myFun();		//Using this we can call overloaded method or any method.
	}
	
	void myFun()
	{
		System.out.println("myFun() called");
	}
}

class UseOfThis
{
	public static void main(String args[])
	{
		new Demo().myFun(5);
	}
}

