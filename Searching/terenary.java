//Array needs to be sorted
import java.util.Scanner;
class terenary
{
  public static int search(int a,int b,int s,int[] arr)
  {
    if(b>=a){
      int mid1=a+(b-a)/3;
      int mid2=b-(b-a)/3;
      if(arr[mid1]==s)
        return mid1;
      if(arr[mid2]==s)
        return mid2;
      if(s<mid1)
        return search(a,mid1-1,s,arr);
      else if(s>mid2)
        return search(mid2+1,b,s,arr);
      else
        return search(mid1+1,mid2-1,s,arr);
    }
    return -1;
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
    ans=search(0,a.length-1,s,a);
    if(ans>=0)
    System.out.println("Number is present at position "+(ans+1));
    else
    System.out.println("Number is not present");
  }
}
