
public class IfElseSwitchCaseDemo {

	public static void main(String[] args) 
	{
		int marks=88;
		
		if(marks>=90)
			System.out.println("Grade is A+");
		else if(marks>=85)
			System.out.println("Grade is A");
		else if(marks>=80)
			System.out.println("Grade is B");
		else 
			System.out.println("FAIL");
			
		int a=10,b=20;
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
		int r=( a>b ? a : b);	//ternary operator
		System.out.println(r);
		
		/*int day=3;	//Monday as first day
		switch(day)
		{
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");	// value= 1+2 allowed
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default: System.out.println("Invalid Input");
				break;
		}
		*/
	}

}
