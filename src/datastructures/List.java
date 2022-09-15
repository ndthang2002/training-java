package datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
	public static void main(String[] args) {
//		java.util.List<String> list = new ArrayList<>();
//		list.add("thang");
//		list.add("long");
//		list.add("hihi");
//		list.add(1,"hra");
//		System.out.println("phan tu thu hia la :" +list.get(2));
//		//show list
//		for(String s:list) {
//			System.out.println(s);
//		}
		
		//tao arr
		String[] arr = new String[] {"java","c++","python"};
		//as arr vao list
		java.util.List<String> list =  Arrays.asList(arr); 
		//show list 
		for(String l :list) {
			System.out.println(l);
		}
	}

}
