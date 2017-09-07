//Array needs to be sorted
import java.util.Scanner;
class jumpSearch
{
  public static boolean search(int[] a,int s)
  {
    int i,n,k,prev=0;
    n=a.length;
    k=(int)Math.floor(Math.sqrt(n));
    while(a[Math.min(k,n)-1]<s){
      prev=k;
      k+=(int)Math.floor(Math.sqrt(n));
      if(prev>=n)
      return false;
    }
    for(i=prev;i<=k && i<n;i++){
      if(a[i]==s)
      return true;
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
