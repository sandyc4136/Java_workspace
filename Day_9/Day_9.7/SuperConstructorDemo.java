class First
{
	private int a;
	
	First()
	{
		System.out.println("zero-arg constructor of First");
		a = 1;
	}
	
	First(int a)
	{
		System.out.println("one-arg constructor of First");
		this.a = a;
	}
	
	void print()
	{
		System.out.println(a);
	}
}

class Second extends First
{
	int b;
	
	Second()
	{
		super();
		System.out.println("zero-arg constructor of Second");
		b = 1;
	}
	
	Second(int a, int b)
	{
		super(a);
		System.out.println("two-arg constructor of Second");
		//super(a);		//ERROR, it must be first statement within the constructor
		this.b = b;
		
	}
	
	void print()
	{
		//super();		//ERROR, we can not use super() inside a non-constructor method
		  super.print();
		System.out.println(b);
      
	}
	
}


class SuperConstructorDemo
{
	public static void main(String args[])
	{
        // Second s2=new Second();
		Second s = new Second(5,10);
        s.print();
		// s2.print();
	}
}

