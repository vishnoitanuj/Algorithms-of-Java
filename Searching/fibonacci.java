/*fib(n-2)=~(1/3)*fib(n)
fib(n-1)=~(2/3)*fib(n)*/

import java.util.Scanner;
class fibonacci
{
  public static int search(int[] a, int x){
    int fib2=0,fib1=1;
    int fib=fib1+fib2;
    while(fib<a.length){
      fib2=fib1;
      fib1=fib;
      fib=fib1+fib2;
    }
    int offset=-1;
    while(fib<a.length){
      fib2=fib1;
      fib1=fib;
      fib=fib1+fib2;
    }
    while(fib>1){
      int i=Math.min(offset+fib2,a.length-1);
      if(a[i]<x){
        fib=fib1;
        fib1=fib2;
        fib2=fib-fib1;
        offset=i;
      }
      else if(a[i]>x){
        fib=fib2;
        fib1=fib1-fib2;
        fib2=fib-fib1;
      }
      else
        return i;
    }
    if(fib1>=0 && a[offset+1]==x)
      return (offset+1);
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
    ans=search(a,s);
    if(ans>=0)
    System.out.println("Number is present");
    else
    System.out.println("Number is not present");
  }
}
