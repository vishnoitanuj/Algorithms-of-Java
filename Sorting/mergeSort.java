/*This program deals with Merge Sort Algorithm.
Time Complexity -: 
Best Case:		O(n)
Average Case:	o(n^2) 
Worst Case:		O(n*log(n)) 
Some Details:-
1) Based on Divide and Conquer Algorithms
2) Recursive Sorting Technique
3) Stable Algorithm: the relative order of records with the same key is preserved.
4) Not in-place Algorithm: Space acquired by temporary variable dependent on size of list.
5) Space Complexity: O(n)
*/
import java.util.Scanner;
class mergeSort{
	public static int[] a;
	public static void sort(int[] a){
		int n,mid,i;
		n=a.length;
		if(n<2)
			return;
		mid = n/2;
		int[] left = new int[mid];
		int[] right=new int[n-mid];
		for(i=0;i<mid;i++)
			left[i]=a[i];
		for(i=mid;i<n;i++)
			right[i-mid]=a[i];
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[] l,int[] r,int[] a){
		int nl,nr,i,j,k;
		i=j=k=0;
		nl=l.length;
		nr=r.length;
		while(i<nl && j<nr){
			if(l[i]<=r[j]){
				a[k]=l[i];
				i++;
			}
			else{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<nl){
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<nr){
			a[k]=r[j];
			j++;
			k++;
		}

	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=d.nextInt();
		a =new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
			a[i]=d.nextInt();
		}
		sort(a);
		System.out.println("-----------------------------------");
		System.out.println("Sorted Array:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
}