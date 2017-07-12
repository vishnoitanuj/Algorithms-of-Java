//Compares with elements on the left of it
import java.util.Scanner;
class insertion{
  public static int[] a;
  public static void sort(){
    int i,j=0,temp;
    for(i=1;i<a.length;i++){
      j=i-1;
      temp=a[i];
      while(j>=0 && a[j]>temp){
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=temp;
    }
  }
  public static void main(String[] args) {
    Scanner d=new Scanner(System.in);
    int n,i;
    System.out.println("Enter length of array");
    n=d.nextInt();
    a=new int[n];
    System.out.println("Enter elements of array");
    for(i=0;i<n;i++)
      a[i]=d.nextInt();
    sort();
    System.out.println("Sorted Array\n----------------------");
    for(int j:a)
      System.out.print(j+"\t");
    System.out.println();
  }
}

//Complexity: O(n2)
