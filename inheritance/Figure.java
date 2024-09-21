package inheritance;

abstract class Figure 
{
	double d1;
	double d2;
	Figure(double d1, double d2) 
	{
		this.d1=d1;
		this.d2=d2;
	}
	// area is now an abstract method
	abstract double area();	
}
