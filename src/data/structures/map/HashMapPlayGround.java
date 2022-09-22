package data.structures.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class HashMapPlayGround {
  @Test
  public void testHashMapUnitTest() throws Exception {

    data.structures.map.HashMap<String, String> mapp = new data.structures.map.HashMap<>(5);

    
    mapp.put("toi", "thang");
    mapp.put("thang", "long");
    
    mapp.put("thang", "sdfd");
  mapp.put("ad", "hihi");
  mapp.put("at", "koko");
  mapp.remove("ad");
//  mapp.clear();
//  assertEquals(0, mapp.size());
  assertTrue(mapp.containsKey("toid"));
  
  //test
  assertEquals("hihi", mapp.get("ad"));
  assertEquals("koko", mapp.get("at"));
  
  
    // test function size
   assertEquals(4,mapp.size());
   // test containsKey
   assertTrue("Tim thay phan tu", mapp.containsKey("thang"));
   assertFalse("khong tim thay", mapp.containsKey("thanvxbdb"));
   
   //test containsvalue 
   assertTrue("tim thay ", mapp.containsValue("long"));
   assertFalse("tim thay",mapp.containsValue("longsafga") );
   
   // test isEmpty
   assertFalse(mapp.isEmpty());
   
   
   // test fuction clear
    mapp.clear();
    assertEquals(0, mapp.size());
    // test toi null
   assertNull(mapp.get("toi"));
   
 
  
   
//    System.out.println(mapp.isEmpty());
    /*
     * System.out.println(mapp.get("toi").hashCode());
     * System.out.println(mapp.containsValue("long"))
     */;

  }
}
