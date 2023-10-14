
class First
{
	void myFun()
	{
		System.out.println("myFun of First");
	}
	
}

class Second extends First
{
	void myFun()
	{
		System.out.println("myFun of Second");
	}
		
}

class ParentRefChildObj

{
	public static void main(String args[])
	{
		First f = new Second();		//OK, because Second is child of First
		f.myFun();
	}
}