//Array needs to be sorted
import java.util.Scanner;
import java.util.Arrays;
class exponential
{
  public static int search(int[] a,int s)
  {
    if(a[0]==s)
    return 0;
    //Find range of binary search by repeated bubbling
    int i=1;
    while(i<a.length && a[i]<s)
    i*=2;

    return Arrays.binarySearch(a,i/2,Math.min(i,a.length),s);
  }
  public static void main(String args[])throws Exception{
    Scanner d=new Scanner(System.in);
    int l,i,s,ans;
    System.out.println("Enter Length of array");
    l=d.nextInt();
    System.out.println("Enter elements of array");
    int[] a=new int[l];
    for(i=0;i<l;i++)
    a[i]=d.nextInt();
    System.out.println("Enter searching number");
    s=d.nextInt();
    ans=search(a,s);
    if(ans>=0)
    System.out.println("Number is present");
    else
    System.out.println("Number is not present");
  }
}
