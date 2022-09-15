package datastructures;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList {
	public static void main(String[] args) {
		// khoi tao arraylist
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		list.add("java");
		list.add("data structures");
		list.add("c#");
		list.add("python");
		System.out.println("cac phan tu co trong list la : ");
		System.out.println(list);

//su dung for de hien thi cac phan tu
		System.out.println("su dung for thuong :");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
//su dung foreach
		System.out.println("su dung for cai tien :");
		for (String ls : list) {

			System.out.println(ls);
		}

//su dung iterator
		System.out.println("su dung interator :");
		Iterator<String> listinterator = list.iterator();
		while (listinterator.hasNext()) { // kiem tra xem co phan tu tiep theo ko
			System.out.println(listinterator.next()); // in ra phan tu tiep theo
		}
//su dung listInterator
		System.out.println("su dung listInterrator :");
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

// su dung addAll
		System.out.println("");
		System.out.println("vd su dung phuong thuc addAll :");
		java.util.ArrayList<String> listA = new java.util.ArrayList<String>();
		listA.addAll(list);
		System.out.println(listA);

// su dung retainAll
		System.out.println("");
		System.out.println("vd su dung phuong thuc retainAll :");
		// khoi tao list b
		java.util.ArrayList<String> listB = new java.util.ArrayList<>();
		listB.add("java");
		// xoa nhung phan tu khong thuoc listB khoi listA
		listA.retainAll(listB);
		System.out.println("listA  :\n" + listA);

// su dung removeAll
		System.out.println("");
		System.out.println("vd su dung phuong thuc removeAll :");
		// xoa nhung phan tu thuoc listB khoi list (java)
		list.removeAll(listB);
		System.out.println("listA :" + list);

// su dung phuong thuc get de truy cap phan tu

		System.out.println("phan tu thu 2 cua list : \n" + list.get(2));

// su dung set de cap nhat lai phan tu trong list
		list.set(2, "react native");
		System.out.println("thay doi phan tu thu 2 :");
		System.out.println(list.get(2));
		System.out.println(list);

// su dung contains de tim kiem phan tu trong list 

		System.out.println(" kiem tra ton tai hay khong :" + list.contains("react nativee"));

// su dung indexof tim kiem vi tri dau tien 

		System.out.println("kiem tra data structures ton tai hay khong : " + list.indexOf("react native"));
//su dung remove theo chi so hoac ten phan tu
		System.out.println("so phan tu list dau : " + list);
		list.remove(1);
		System.out.println("sau khi xoa phan tu index=1 : " + list);
		list.remove("react native");
		System.out.println("sau khi xoa phan tu react navtive : " + list);

//su dung clear 
		System.out.println("so phan tu list dau" + list);
		System.out.println("cac phan tu list ban dau " + list.size());
		// clear list
		list.clear();
		System.out.println("so phan tu list dau" + list);
		System.out.println("cac phan tu list ban dau " + list.size());

	}

}
