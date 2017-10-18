/*This is a program to calculate GCD of two numbers using Euclids Algorithms. Time Complexity: O(log(number of digits in smaller number))*/
import java.util.Scanner;
class GCDbyEuclid{
	public static int euclid_gcd(int a, int b){
		while(b!=0){
			int remainder =a%b;
			a = b;
			b = remainder;
		}
		return a;
	}
	public static int euclid_gcd_recursive(int a,int b){
		return b==0 ? a : euclid_gcd_recursive(b, a % b);
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD");
		int a=d.nextInt();
		int b=d.nextInt();
		System.out.println("GCD Using Euclid: "+euclid_gcd(a,b));
		System.out.println("GCD Using Euclid + Recursion: "+euclid_gcd_recursive(a,b));
	}
}