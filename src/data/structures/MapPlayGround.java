package data.structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MapPlayGround {
  @Test
  public void testHashMapUnitTest() throws Exception {

    data.structures.map.HashMap<String, String> mapp = new data.structures.map.HashMap<>();

    
    mapp.put("toi", "thang");
    mapp.put("thang", "long");
    mapp.put("A", "AH");
    mapp.remove("A");
    
    // test function size
   assertEquals(2,mapp.size());
   // test containsKey
   assertTrue("Tim thay phan tu", mapp.containsKey("thang"));
   assertFalse("khong tim thay", mapp.containsKey("thanvxbdb"));
   
   //test containsvalue 
   assertTrue("tim thay ", mapp.containsKey("long"));
   assertFalse("tim thay",mapp.containsValue("long") );
   
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
