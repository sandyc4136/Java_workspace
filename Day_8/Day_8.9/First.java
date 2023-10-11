package mypack1;

public class First{
	public int a;
	private int b;
	int c;		//default
	protected int d;
	
	void firstFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//OK
		System.out.println(c);	//OK
		System.out.println(d);	//OK
	}
	
	void setB(int x)
	{
		this.b = x;
	}
}

package mypack1;
public class Second extends First
{
	void secondFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//OK
		System.out.println(d);	//OK
		
		//b = 10;			//ERROR
		setB(10);
	}		
}

Second s = new Second();
s.secondFun();



package mypack2;
import mypack1.First;

public class Third extends First
{
	void thirdFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//ERROR
		System.out.println(d);	//OK
	}
}

package mypack2;
import mypack1.First;

public class Fourth extends First
{
	//a,b,c,d
	
	void thirdFun()
	{
		First f = new First();
		System.out.println(f.a);	//OK
		System.out.println(f.b);	//ERROR
		System.out.println(f.c);	//ERROR
		System.out.println(f.d);	//ERROR
	}
	
	
	void myAnotherFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//ERROR
		System.out.println(d);	//OK
	}
}


class Fifth
{
	void myFun()
	{
		Fourth ft = new Fourth();
		System.out.println(ft.d);	//ERROR
    }
}
