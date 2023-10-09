class Demo
{
	int a = 2;
	static int b;

	Demo() // constructor
	{
		System.out.println("zero-arg constructor");
		a = 10;
	}

	static
	{
		System.out.println("static block");
        myFun();
		b = 20;
		anotherFun();
	}
	

	{
		System.out.println("non-static block");
		a = 5;
		print();
	}


	static void myFun()
	{
		System.out.println("myFun of Demo");
	}

	static void anotherFun()
	{
		System.out.println("anotherFun of Demo");
	}
	
	 void print()
	{
		System.out.println("a = " + a);
	}
}

class BlockDemo
{
	public static void main(String args[])
	{
		//Demo.myFun();

		System.out.println("Creating first object");
		Demo d1 =new Demo();	
		d1.print();

		// System.out.println("Creating second object");
		// Demo d2=new Demo();
        // d2.print();
	}
}