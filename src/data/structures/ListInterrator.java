package data.structures;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListInterrator {
public static void main(String[] args) {
	
	java.util.List<String> list = new ArrayList<>();
	list.add("thang");
	
	list.add("long");
	list.add("hihi");
	list.add(1,"hra");
	System.out.println("phan tu thu hia la :" +list.get(2));
	ListIterator<String > itr = list.listIterator();
	System.out.println("duyet mang tu dau den cuoi");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("duyet mang tu cuoi den dau");
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	 
}
}
