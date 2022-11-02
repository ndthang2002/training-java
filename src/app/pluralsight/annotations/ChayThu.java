package app.pluralsight.annotations;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class ChayThu {
  public static void main(String[] args) throws IllegalAccessException {
    
    SuperMan superMan= new SuperMan();
    superMan.setDataOfBirth(LocalDateTime.now());
    superMan.setName("loda");
    
    String json = JsonNameProcessor.toJson(superMan);
    System.out.println(json);
    
    // lay anotation ra 
    Class<?> supers = superMan.getClass();
    Field  fi[] = supers.getDeclaredFields();
    for (Field d : fi) {
      System.out.println(d.getDeclaredAnnotation(JsonName.class));
    }
  }
}
