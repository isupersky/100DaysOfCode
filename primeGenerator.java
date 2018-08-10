	import java.util.Scanner;


	class Main
	{
		public static void main (String[] args) 
		{
			Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int start, end;
		for(int i = 0 ; i <t; i++)
		{
			
			//int start, end;
			
			start =sc.nextInt();
			end =sc.nextInt();
			
			for( int j = start; j <= end; j++)
			{
				if(m.isPrime(j))
				{
					System.out.println(j);
				}
				
			}
			
			
		}
		
		}
		
			boolean isPrime(int n)
			{
				 if (n <= 1)
				return false;
		  
			// Check from 2 to n-1
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;
		  
			return true;
			}
			
	}
