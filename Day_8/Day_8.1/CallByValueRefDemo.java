class First
{
	int val;
	
}

class Demo
{
	static void myFun(int x, int y)
	{
		x = x + 2;
		y = y + 2;
		System.out.println(x);		//7
		System.out.println(y);		//12
	}
	
	static First anotherFun(First fst)
	{
		System.out.println(fst.val);
		fst.val = 25;
		return fst;
	}
}


class CallByValueRefDemo
{
	public static void main(String args[])
	{
		int a = 5;
		int b = 10;
		
		Demo.myFun(a,b);
		System.out.println(a);		//5
		System.out.println(b);		//10
		
		First f = new First();
		f.val = 5;
		First f1 = Demo.anotherFun(f);			//OK
		//First f1 = Demo.anotherFun(new First());	//OK, here new First object is created
		System.out.println(f1.val);	//25
	}
}
