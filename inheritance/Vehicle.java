package inheritance;

public class Vehicle 
{
	int n;
	String color="White";
	
	Vehicle()
	{
		System.out.println("Superclass constructor");
	}
	
	Vehicle(int n, String color) 
	{		
		this.n = n;
		this.color = color;
	}

	void display()
	{
		System.out.println("Superclass method");
		System.out.println("Color_Super:"+color);
	}
}
