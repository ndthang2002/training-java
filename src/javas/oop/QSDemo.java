package javas.oop;

public class QSDemo {
public static void main(String[] args) {
  
  char[] items = {'s','f','m','w','t','a'};
 System.out.println("mang ban dau ");
 for(int i =0;i<items.length;i++) {
   System.out.println(items[i]);
 }
 QuickSort.qsort(items);
 
 System.out.println(" mang sau khi sap xep");
 for(int i=0; i<items.length;i++) {
   System.out.println(items[i]);
 }
}
}

class QuickSort{
  //thiết ập một lời gọi đên phương thức quicksort thực sự 
  static void qsort(char items[]) {
    qs(items,0,items.length-1);
  }
  
  // phiên bản đệ quy của giải thuật quicksort dùng cho ký tư 
  private static void qs ( char items[] , int left , int right) {
    int i,j;
    char x,y;
    i = left ; j=right;
    x = items[(left+right)/2];
    
    do {
      while((items[i]<x)&& (i<right))i++;
      while((x<items[j]) && (j>left))j--;
      
      if(i<=j) {
        y= items[i];
        items[i]= items[j];
        items[j]= y;
        i++;j--;
      }
    } while (i<=j);
    if(left<j) qs(items, left, j);
    if(i<right)qs(items, i, right);
  }
}