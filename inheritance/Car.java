package inheritance;

public class Car extends Vehicle
{
	int tyres;	
	Car()
	{
		super();
		System.out.println("Color_Super:"+super.color);
	}
	
	Car(int n, String color, int tyres) 
	{		
		super(n, color);		
		this.tyres=tyres;
	}

	void show()
	{
		super.display();		
		System.out.println("Subclass method");
		System.out.println("Color_Subclass:"+color);
		System.out.println("Tyres of Car are:"+tyres);
	}	
}
