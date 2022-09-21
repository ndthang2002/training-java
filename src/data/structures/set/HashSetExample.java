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
  
}
