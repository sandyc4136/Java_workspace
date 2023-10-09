

public class StaticAndNonStatic {
    public static void main(String args[]){
        new Demo();
    }
    
}

class Demo
{
	{
		System.out.println("non-static block-1");
	}
	
	static
	{
		System.out.println("static block-1");
	}
	
	{
		System.out.println("non-static block-2");
	}
	
	static
	{
		System.out.println("static block-2");
	}
}