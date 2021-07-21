import java.util.Random;

public class Runner {
  public static Integer[] genArr(int len) {
    Integer[] arr = new Integer[len];
    Random rand = new Random();
    for(int i = 0;i < len; i++) {
      arr[i] = rand.nextInt(len);
    }
    /*for(int i = 0;i < len;i++) {
      int n = rand.nextInt(len);
      int swap = arr[i];
      arr[i] = arr[n];
      arr[n] = swap;
    }*/
    
    return arr;
  }
  public static void displayArr(Integer[] arr) {
    for(int i = 0;i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    Integer[] arr = genArr(10);
    displayArr(arr);
    //SelectionSort.sort(arr);
    //SelectionSort.displayArr(arr);
    //InsertionSort.sort(arr);
    //InsertionSort.displayArr(arr);
    Shellsort.sort(arr);
    Shellsort.displayArr(arr);
  }
}
