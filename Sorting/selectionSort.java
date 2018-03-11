/*This program deals with selection sort Algorithm. In this the min/max element is selected and moved to its right index.
Time Complexity:
Worst Case: O(n^2)
Best Case: O(n^2)
Avergae Case: O(n^2) */
import java.util.Scanner;
class selectionSort{
	public static void sort(int[] a){
		int i,j,min,temp;
		for(i=0;i<a.length-1;i++){
			min=i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[min])
					min=j;
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("-----------------------------------");
		System.out.println("Sorted Array:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=d.nextInt();
		int[] a =new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
			a[i]=d.nextInt();
		}
		sort(a);
	}
}
