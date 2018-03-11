//Prerequisite: Counting Sort
import java.util.Scanner;
import java.util.Arrays;

class radix{

  public static void radixSort(int[] a){
    int m = getMax(a);
    for(exp=1;m/exp>0;exp*=10)
      countSort(a,exp);
  }

  private static int getMax(int[] a){
    max=a[0];
    for(int i=1;i<a.length;i++){
      if(a[i]>max)
        max=a[i];
    }
    return max;
  }

  private static void countSort(int[] a,int exp){
    int output[] = new int[a.length];
    int count[] = new int[10];
    for(i=0;i<10;i++)
    count[i] = 0;
    // Store count of occurrences in count[]
    for(i=0;i<a.length;i++)
    count[(a[i]/exp)%10]++;
    // Change count[i] so that count[i] now contains actual
    //  position of this digit in output[]
    for(i=1;i<10;i++)
    count[i] += count[i-1];
    //Building output array
    for(i=a.length-1;i>=0;i--){
      output[count[(a[i]/exp)%10]-1] = a[i];
      count[(a[i]/exp)%10]--;

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for(i=0;i<a.length;i++)
    a[i] = output[i];
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
