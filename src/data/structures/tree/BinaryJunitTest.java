package data.structures.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryJunitTest {

@Test
public  void testBinaryJunit() {
  BinaryTree<Integer> biTree = new BinaryTree<>();
  biTree.add(10);
  biTree.add(5);
  biTree.add(45);
  biTree.add(9);
  biTree.add(14);
  biTree.add(3);
  biTree.add(8);
  
  assertEquals(7,biTree.size());
  assertEquals(true, biTree.contains(8));
  System.out.println(biTree);
  assertEquals(true, biTree.contains(9));
  biTree.remove(9);
  assertEquals(false, biTree.contains(9));
  assertEquals(6,biTree.size());
  
}
}
