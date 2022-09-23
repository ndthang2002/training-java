package data.structures.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetExample {

  @Test
  public void testHashmap() throws Exception{
    HashSet<String > sett = new  HashSet<String>();
    sett.add("thang");
    sett.add("hien");
    sett.add("kien");
    sett.add("ha");
    
   assertEquals(4, sett.size());
   
   assertEquals(true, sett.contains("thang"));
   
   
  }
  @Test
  public void testHashmap2() throws Exception{
    HashSet<String > sett = new  HashSet<String>();
    sett.add("thang");
    sett.add("hien");
    sett.add("kien");
    sett.add("ha");
    
    
    HashSet<String > sett2 = new  HashSet<String>();
 
    sett2.add("sf");
    sett2.addAll(sett);
    
    assertEquals(5, sett2.size());
    
//    sett.clear();
    assertTrue(sett.contains("thang"));
    assertEquals(true, sett.contains("thang"));
    assertEquals(4, sett.size());
    assertTrue(sett.add("hihi"));
//    assertNull(sett.remove("fsdf"));
   
   
  }
  @Test
  public void testHashmap3() throws Exception{
    HashSet<String > sett = new  HashSet<String>();
    sett.add("thang");
    sett.add("hien");
    sett.add("kien");
    sett.add("ha");
    
    HashSet<String > set2 = new  HashSet<String>();
    set2.add("thang");
    set2.add("hien");
    set2.add("kien");
    set2.add("ad");
    
    //test kiem tra 2 set
//    assertEquals(true, set2.containsAll(sett));
    
   set2.clear();
   assertEquals(true, set2.isEmpty());
    
    
    
  }
  @Test
  // test set java util\
  public void testHashMap4() throws Exception{
    HashSet<String> set = new HashSet<>();
    set.add("h1");
    set.add("tam");
    set.add("may");
    assertEquals(true, set.contains("h1"));
  }
  
}
