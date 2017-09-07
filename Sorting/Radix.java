//Prerequisite: Counting Sort
import java.util.Scanner;
import java.util.Arrays;

class radix{
  public static int max(int[] a){
    max=a[0];
    for(int i=1;i<a.length;i++){
      if(a[i]>max)
        max=a[i];
    return max;
    }
  
  }
  public static void main(String args[])throws Exception{
    Scanner d=new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=d.nextInt();
    int[] a=new int[n];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++)
      a[i]=d.nextInt();

  }
}
