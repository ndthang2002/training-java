package data.structures;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListPlayGround {
public static void main(String[] args) {
  
  LinkedList<String> listt = new LinkedList<String>();
  LinkedList<String> lis = new LinkedList<String>();

  listt.add("afs");
  listt.add("tma");
  listt.add("lof");
  listt.add("kiki");
  listt.add("sfsf");
  listt.add("sfff");
 
  
  System.out.println(listt.size());
  for(int i=0 ; i< listt.size();i++) {
    System.out.println("phan tu thu: "+listt.get(i));
  }
  
  // chuyen listt sang arr roi add vao lis
  String[] arrs = new String[listt.size()];
  for(int i=0; i<listt.size();i++) {
    arrs[i] = listt.get(i);
  }
  
  lis.addAll(arrs);
  for(int i=0 ; i< lis.size();i++) {
    System.out.println("phan thu "+i+"cua lis :"+lis.get(i));
  }
  

  
  
  
	// khai báo linkedlist  kiểu string  tên là líst
	java.util.LinkedList<String> list = new java.util.LinkedList<String>();
	//thêm phần tử vào list 
	list.add("java");
	list.add("python");
	list.add("c#");
	list.add("data structures");
	list.add(2,"sql");
	// hiển thị các phần tủ trong list ra 
	System.out.println("các phần tử có trong list là : ");
	System.out.println(list);
	
	// sử dụng vòng foreach để hiển thị các phần tử của list
//	System.out.println("(foreach) các phần tử tron list là :");
	for(String ls :list) {
		System.out.println(ls);
	}
	
	// sử dungj for để duyệt qua list
	System.out.println("(for)các phần tử trong list là :");
	for (int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	//sử dụng iterator đê duyệt qua list
	Iterator<String > iterator = list.iterator();
	System.out.println("sử dụng iterator để duyệt qua list ");
	while(iterator.hasNext()) {
	
		System.out.println(iterator.next());
	}
	
	// sử dụng listInterator  để duyệt list
	ListIterator<String > iteratorr = list.listIterator();
	System.out.println("sử dụng ListIterator để duyệt qua list ");
	while(iteratorr.hasNext()) {
		
		System.out.println(iteratorr.next());
	}
	
	//sử dụng addAll 
	java.util.LinkedList<String > listA = new java.util.LinkedList<>();
	listA.addAll(list);
	System.out.println("listA:");
	showList(listA);
	
	// sử dụng retainAll xóa các phần tử không thuộcc listB 
	java.util.LinkedList<String > listB = new java.util.LinkedList<>();
	listB.add("java");
	System.out.println("su dung retainAll : ");
	 listA.retainAll(listB);
	 showList(listA);
	 
	// sử dụng removeAll xoa các phần tử thuộc listB
	System.out.println("su dung removeAll :");
    // xóa những phần tử thuộc listB
    list.removeAll(listB);
   showList(list);
   
   
// sử dụng remove để xóa phần tử 2 cách theo chỉ số và xóa trực tiếp phần tử 
   
   System.out.println(" xóa phần tử bằng remove");
   System.out.println(" đây là list ban đầu "+list);
   list.remove(1);
   System.out.println(" list sau khi xóa index 1 : "+list);
   
   list.remove("c#");
   System.out.println(" xóa c# trực tiếp :" +list);
   
   //sử dụng phương thưcs get để truy cập đến mọt phần tử theo chỉ số
   System.out.println("truy cập đến phần tử thứ 0 : " +list.get(0));
   
   // sử dụng phương thức set để cập nhật nhật phần tử 
   list.set(0, "java");
   System.out.println("phần tử thư 0 sau khi được cập nhật : " +list.get(0));
   
   // sử dụng contains để tìm kiếm phần tử và trả về giá trị true,false
   //kiểm tra xem java có tồn tại trong list hay không 
   System.out.println("java có tồn tại trong list không :"+list.contains("java"));
   
   //sử dụng indexof để tìm kiếm vị trí xuất hiện đầu tiên của một phần tử  trong linkedlist	
    list.add(2,"java");
   System.out.println(" sử dụng indexof tìm kiếm vị trí xuất hiện đầu tiên  :"+list.indexOf("java"));
   
   //sử dụng lastindexof để tìm kiếm vị trí xuất hiện cuối cùng của một phần tử  trong linkedlist	
   System.out.println("list hiện tại  :" +list);
  
   System.out.println(" sử dụng indexof tìm kiếm vị trí xuất hiện cuối cùng  :"+list.lastIndexOf("java"));
   
   // sử dụng toArray để chuyển đổi linkedlist về thành mảng 
   // toArray chuyển đổi list sang mảng 
   System.out.println("chuyển đổi linkedlist sang mảng");
   Object[] arr = list.toArray();
   //hiển thij phần tử có trong mảng array
   for (int i=0;i<arr.length;i++){
	   System.out.println("phần tử tại vị trí " +i+" "+" trong arr là "+arr[i]);
   }
   // sử dụng clear để xóa tất cả các phần tử trong list 
   System.out.println("sử dụng phương thức clear :");
   System.out.println(" list ban đầu :"+list);
   showList(list);
   System.out.println("list sau khi clear :");
   list.clear();
   showList(list);
   
   
	
	
}
   public static void showList(java.util.LinkedList<String> list) {
	   for(String obj :list) {
		   System.out.println("\t" +obj+",");
		   
	   }
	   System.out.println();
   }
	
	}