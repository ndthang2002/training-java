package data.structures.set;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;
import org.junit.jupiter.api.io.TempDir;

public class HashSetPlayGround {
  @Test
public void testSet() {
  
 data.structures.set.HashSet<String> set = new data.structures.set.HashSet<>();
  set.add("thang");
  set.add("hiekn");
  set.add("thuy");
 
  assertEquals(true, set.contains("thang"));
  assertEquals(3, set.size());
  set.remove("thuy");
  assertEquals(false, set.contains("thuy"));
  
}
}

