package javas.oop;

public class Array {
public static int hihi=2009;

  public static void main(String[] args) {
    int[] arr = { 7, 4, 6,  67, -43, 525, 84 };
    int a, b, t, size;
    size = 7;
 
    
    // sap xep
    for (a = 1; a < size; a++) {
      for (b = size - 1; b >= a; b--) {
        if (arr[b - 1] > arr[b]) {
          t = arr[b - 1];
          arr[b - 1] = arr[b];
          arr[b] = t;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
                  