/*
Create a Gravity Calculator in java to compute the position of an object after falling for
10 seconds, outputting the position in meters. The formula in Math notation is:
x(t) = 0.5 × at 2 + vit + xi
Variable Meaning Value
a Acceleration (m/s 2) -9.81
t Time (s) 10
vi Initial velocity (m/s) 0
xi Initial position 0
*/

//import java.util.Scanner;

class gravityCalculator{
	
	public static void main(String args[]){
	float a = -9.81f;
	 int t = 10;
	 int iv = 0;
	 int ip = 0;
	 
	 double x = (0.5*(Math.pow((a*t), 2))) + (iv*t) +ip;
	 
	System.out.println(x); }
	
}