
public class InsertionSort {
  public static void sort(Comparable[] a) {
    for(int i = 0 ;i < a.length;i++) {
      for(int j = i; j > 0; j-- ) {
        if(less(a[j],a[j-1])){
          exch(a,j,j-1);
        }
        else {
          break;
        }
      }
    }
  }
  
  public static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }
  
  public static void exch(Comparable[] a, int i, int j) {
    Comparable swap = a[i];
    a[j] = a[i];
    a[i] = swap;
  } 
  
  public static void displayArr(Comparable[] a) {
    for(int i = 0;i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
