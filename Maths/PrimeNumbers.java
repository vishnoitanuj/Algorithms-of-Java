/*Method Employed here is Trial Division Method. Complexity: O(sqrt(N))*/
import java.util.Scanner;
class PrimeNumbers{
	public static boolean check(int n){
		int i;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter Number to check");
		int n=d.nextInt();
		boolean result=check(n);
		if(result && n>1)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" is not Prime");
	}
}