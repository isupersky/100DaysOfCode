// code to print sum of 5 integer


/*Code to print sum of 5 integer numbers without using single variable where input will be
taken through command line arguments.
a. Perform the above code using a function and call it in main().
b. Make another class and a function in it to perform the above task.*/

class A{
	
	public static void main(String args[])
	{
		B obj = new B();
		
		obj.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		
	}
	
	
}

class B{
	
	void sum(int x, int y , int z)
	
	{
			int sum = x+y+z;
			System.out.println(sum);
			
	}
}
