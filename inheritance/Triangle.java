package inheritance;

class Triangle extends Figure 
{
	Triangle(double d1, double d2) 
	{
		super(d1, d2);
	}
	// override area for right triangle
	double area() 
	{
		System.out.println("Inside Area for Triangle.");
		return d1 * d2 / 2;
	}
}
