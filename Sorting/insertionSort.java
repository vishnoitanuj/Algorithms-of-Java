/*This program deals with Insertion Sort Algorithm. In this the array gets sorted from the left side.
Time Complexity -: 
Best Case:		O(n)
Average Case:	o(n^2) 
Worst Case:		O(n^2) 
This is better than bubble and insertion sorts.*/
import java.util.Scanner;
class insertionSort{
	public static void sort(int[] a){
		int i,gap,value,temp;
		for(i=1;i<a.length;i++){
			value=a[i];
			gap=i;
			while(gap>0 && a[gap-1]>value){
				a[gap]=a[gap-1];
				gap--;
			}
			a[gap]=value;
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