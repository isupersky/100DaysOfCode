/*
 program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. 
 More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. 
 All numbers at input are integers of one or two digits.

*/

import java.util.Scanner;

class scannerTest{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	while (true){
		int x = sc.nextInt();
		if(x== 42)
			break;

		System.out.println(x);
		
	}
	}
}
