public class AbstractMethodDemo {
    public static void main(String args[]){
        new Square().calArea();
        new Circle().calArea();
    }
}
abstract class Shape
{
	double area;
	abstract void calArea();
	
	Shape() // zero-arg constructor
	{
		System.out.println("Shape constructor");
	}
	
	void printArea() // concrete method
	{
		System.out.println(area);
	}
}

class Square extends Shape
{
	double side=5.0;
	
	void calArea() // overriding of abstract ( calArea ) method from class First
	{
		area = side * side;
		printArea();
	}
}

class Circle extends Shape
{
    double radius=12.0;
	void calArea() //overriding of abstract ( calArea ) method from class First 
	{
		area = 3.14 * radius * radius;
		printArea();
	}
}
