package inheritance;

class Rectangle extends Figure 
{
	Rectangle(double d1, double d2) 
	{
		super(d1, d2);
	}
	// override area for rectangle
	double area() 
	{
		System.out.println("Inside Area for Rectangle.");
		return d1 * d2;
	}
}
