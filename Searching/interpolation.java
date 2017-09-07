//Array needs to be sorted
import java.util.Scanner;
class interpolation
{
  public static boolean search(int[] a,int s)
  {
    int low=0,high=a.length-1,pos=0;
    while(low<=high && s>=a[low] && s<=a[high]){
      pos=low+((high-low)/(a[high]-a[low])*(s-a[low]));
      if(a[pos]==s)
      return true;
      if(s<a[pos])
      high=pos-1;
      else
      low=pos+1;
    }
    return false;
  }
  public static void main(String args[])throws Exception{
    Scanner d=new Scanner(System.in);
    int l,i,s;
    boolean ans;
    System.out.println("Enter Length of array");
    l=d.nextInt();
    System.out.println("Enter elements of array");
    int[] a=new int[l];
    for(i=0;i<l;i++)
    a[i]=d.nextInt();
    System.out.println("Enter searching number");
    s=d.nextInt();
    ans=search(a,s);
    if(ans)
    System.out.println("Number is present");
    else
    System.out.println("Number is not present");
  }
}
