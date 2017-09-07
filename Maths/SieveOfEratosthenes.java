/*This programs displays the all the prime numbers from 2 to the number using algorithm: Sieve of Erastosthenes.
Complexity: O(n*log(log(n)))*/
import java.util.Scanner;
class SieveOfEratosthenes{
	public static void display(int n){
		int i,j;
		int[] prime=new int[n+1];
		for(i=0;i<=n;i++)
			prime[i]=1;
		prime[0]=0;
		prime[1]=0;
		for(i=2;i<=Math.sqrt(n);i++){
			if(prime[i]==1){
				for(j=2;i*j<=n;j++)
					prime[i*j]=0;
			}
		}
		for(i=0;i<=n;i++){
			if(prime[i]==1)
				System.out.print(i+" ");
		}
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=d.nextInt();
		display(n);
	}
}