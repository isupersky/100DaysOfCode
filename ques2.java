/*Create a Financial Calculator to calculate the SimpleInterest and CompoundInterest
by taking command line values for principal, rate and time.
a. Extend the code to calculate ‘Final Value’ of investment (V) of an investment
(principal P) compounded yearly for T years at interest rate R is given by the
formula:
V = P (1 + R)T
b. Perform the above code using a function and call it in main().
c. Make another class and a function in it to perform the above task.

*/


class interest{
	
	public static void main(String args[])
	{
		System.out.println("This is main....");
		double principal, rate, time ;
		principal = Integer.parseInt(args[0]);
		rate = (Integer.parseInt(args[1]));
		time = Integer.parseInt(args[2]);
		
		simpleInterest obj1= new simpleInterest();
		obj1.simpleInterest(principal,rate, time);
		compoundInterest obj2 = new compoundInterest();
		obj2.compoundInterest(principal,rate,time);
		
	}
		
		
}

class simpleInterest{
	
	void simpleInterest(double p, double r, double t)
	{
		double interest = (p*r*t)/100;
		System.out.println(interest);
		
	}
	
}

class compoundInterest{
	
	void compoundInterest(double p, double r, double t)
	{	
		System.out.println(r/100);
		System.out.println(1+(r/100));
		System.out.println(Math.pow((1+(r/100)),t));
		System.out.println(p);
		double interest = p*(Math.pow((1+(r/100)),t));
		System.out.println(interest);
		
	}
	
}