/*
Hourly Pay Calculator
Foo Corporation needs a program to calculate how much to pay their hourly employees. The US Department of Labor requires that employees get paid time and a half for any hours over 40 that they work in a single week.
For example, if an employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay. The State of Massachusetts requires that hourly employees be paid at least $8.00 an hour. Foo Corp requires that an employee not work more than 60 hours in a week.
Summary of Rules
• An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
• For every hour over 40, they get overtime = (base pay) × 1.5.
• The base pay must not be less than the minimum wage ($8.00 an hour).
• If it is, print an error. If the number of hours is greater than 60, print an error
message.
Create a new class called FooCorporation. Write a method that takes the base pay and
hours worked as parametersand prints the total pay or an error. Write a main method that
calls this method for each of these employees:
			Base Pay Hours 		Worked
Employee 1 			$7.50 		35
Employee 2 			$8.20 		47
Employee 3 			$10.00 		73

*/

import java.util.Scanner;

class hourlypay {
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		float hoursWorked, extra;
		float basePay;
		double sal;
		System.out.println("Enter the number of hours worked by ");
		hoursWorked = sc.nextFloat();
		
		System.out.println("Enter the base pay : ");
		basePay = sc.nextFloat();
		
		if (basePay < 8 )
		{System.out.println("Error !! Base pay can not be less that 8.");
			System.exit(0);
		}
		
		if (hoursWorked > 60)
		{System.out.println("Error !! employee can not work more than 60 hours.");
			System.exit(0);
		}
		else if (hoursWorked > 40)
		{
			extra = hoursWorked - 40;
			sal = (40*basePay) + (extra *(basePay*1.5));
			System.out.println(sal);
			System.exit(0);
		}
		
		sal = hoursWorked* basePay;
		System.out.println(sal);
		System.exit(0);
		
	}
	
}