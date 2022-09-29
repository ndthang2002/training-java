package data.structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import org.junit.Test;

public class ArrayListPlayGround {
  @Test
	public void testArrayList() {
	  ArrayList<String> list = new ArrayList<>();
	  ArrayList<String> list2 = new ArrayList<>();
	  list.add("thang");
	  list.add("thao");
	  list.add("tam");
	  list.add("koko");
	  list.add(1, "hien");
	  assertEquals(5, list.size());
	  assertEquals("thang", list.get(0));
	  assertNull(list.get(9));
	  assertEquals("hien", list.get(1));
	  assertEquals("koko", list.get(4));
	  
	  // chuyen qua mang de add zo
	  String[] arr = new String[list.size()];
	  for(int i=0;i<list.size();i++) {
	     arr[i]= list.get(i);
	  }
	  list2.addAll(arr);
	  assertEquals(5, list2.size());
	  list.remove();
	  assertEquals("hien", list.get(0));
	  list.remove("tam");
	  assertEquals(null, list.get(2));
	  list.set(4, "hihi");
	  assertEquals("hihi", list.get(4));
	  list.clear();
	  assertEquals(0, list.size());
	  
	}
}