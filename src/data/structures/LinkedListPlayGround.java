package data.structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.ListIterator;

import org.junit.Test;

public class LinkedListPlayGround {
  @Test
  public void testLinkedlist() {

    LinkedList<String> listt = new LinkedList<String>();
    LinkedList<String> lis = new LinkedList<String>();

    listt.add("afs");
    listt.add("tma");
    listt.add("lof");
    listt.add("kiki");
    listt.add("sfsf");
    listt.add("sfff");
    listt.add(5, "nga");
    assertEquals("nga", listt.get(5));

    assertEquals(7, listt.size());
    listt.remove("tma");
    assertEquals(6, listt.size());
    assertEquals("lof", listt.get(1));

    listt.remove();
    assertEquals(5, listt.size());
    listt.set(2, "haha");
    assertEquals("haha", listt.get(2));

  }
}