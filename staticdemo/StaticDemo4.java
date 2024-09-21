package staticdemo;

public class StaticDemo4 
{
	static double circle_area(double r)
	{
		return 3.14*r*r;
	}
	public static void main(String[] args) 
	{
		double area=StaticDemo4.circle_area(7.1d);
		//double area=circle_area(7.1d); //this is also allowed
		System.out.println("Area of circle is "+area);
	}

}
