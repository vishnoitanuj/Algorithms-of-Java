import java.util.Scanner;
class primeFactors{
	public static void factors(int n){
		int l=(int)Math.sqrt(n);
		int[] a=new int[l*2];             //Factors cannot be greater than sqrt(n)*2
		int i,j=0,k=l*2-1;
		for(i=0;i<a.length;i++)
			a[i]=0;
		for(i=1;i<Math.sqrt(n);i++){
			if(n%i==0){
				a[j++]=i;
				a[k--]=(n/i);
			}
		}
		if(n%Math.sqrt(n)==0)
			a[j]=(int)Math.sqrt(n);
		for(i=0;i<l*2;i++)
			if(a[i]!=0)
				System.out.print(a[i]+"\t");
	} 
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=d.nextInt();
		factors(n);
	}
}