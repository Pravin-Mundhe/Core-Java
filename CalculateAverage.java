//This program calculates average using double numbers
// as well as strict integer numbers

import java.util.Scanner;

public class CalculateAverage
{
    public static void main(String[] args) {
        double avg=0, sum=0, temp=0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        while (sc.hasNextDouble())
        {
            temp=sc.nextDouble();
            if(temp==0)
                break;
            else
                count++;
            sum=sum+temp;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The count is "+count);
        avg=sum/count;
        System.out.println("the average is "+avg);
        sc.close();
        /*
        int sum=0,temp=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        while (sc.hasNextInt())
        {
            temp=sc.nextInt();
            if(temp==0)
                break;
            else
                count++;
                sum=sum+temp;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The count is "+count);
        System.out.println("the average is "+(sum/count));
        sc.close();*/
    }
}
