import java.util.Scanner;
class QuickSort{
  public static void sort(int[] input,int si,int ei){
    if(si>=ei)
    return;
    int pivot_pos = getPivot(input,si,ei);
    sort(input,si,pivot_pos-1);
    sort(input,pivot_pos+1,ei);
  }
  public static int getPivot(int[] a,int si,int ei){
    int pivot = a[si];
    int c=0;
    int i,j;
    for(i=si+1;i<=ei;i++){
      if(a[i]<pivot)
      c++;
    }
    int pivot_pos = si+c;
    int t = a[pivot_pos];
    a[pivot_pos] = a[si];
    a[si] = t;
    i=si;
    j=ei;
    while(i<pivot_pos && j>pivot_pos){
      if(a[i]>pivot){
        if(a[j]<pivot){
          t = a[j];
          a[j] = a[i];
          a[i] = t;
          j--;
          i++;
        }
        j--;
      }
      else
      i++;
    }
    /*If Pivot as last element, the following can also be done
    int pivot = a[ei];
    int i = si-1;
    int j,t;
    for(j=si;j<ei;j++){
      if(a[j]<=pivot){
        i++;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
    t = a[i+1];
    a[i+1] = a[ei];
    a[ei] = t;
    return (i+1);*/
  }
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int input [] = new int[n];
    for(int i=0;i<n;i++)
    input[i] = sc.nextInt();
    sort(input,0,n-1);
    System.out.println("Sorted Array:");
    for(int i=0;i<n;i++)
    System.out.println(input[i]+"  ");
  }
}
