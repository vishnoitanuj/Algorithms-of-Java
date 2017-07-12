//Mapping Used
import java.util.Scanner;
class counting{
  public static void sort(int[] a){
    int i,j,max=a[0];
    for(i=0;i<a.length;i++){
      if(a[i]>max)
        max=a[i];
    }
    int[] arr=new int[max+1];
    for(i=0;i<=max;i++)
      arr[i]=0;
    for(i=0;i<a.length;i++)
      arr[a[i]]++;
    System.out.println("Sorted Array\n----------------------");
    for(i=0;i<=max;i++){
      int t=arr[i];
      while(t-->0)
        System.out.print(i+"\t");
    }
   }
  public static void main(String[] args) {
    Scanner d=new Scanner(System.in);
    int n,i;
    System.out.println("Enter length of array");
    n=d.nextInt();
    int[] a=new int[n];
    System.out.println("Enter elements of array");
    for(i=0;i<n;i++)
      a[i]=d.nextInt();
    sort(a);
    System.out.println();
  }
}

//Complexity: O(a.length+max)
