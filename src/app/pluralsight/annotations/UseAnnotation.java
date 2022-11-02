package app.pluralsight.annotations;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Optional;

public class UseAnnotation {

  public static void main(String[] args) throws NoSuchFieldException, SecurityException {
   Student st = new Student();
   Class<?> student = st.getClass();
   Field field = student.getDeclaredField("name");
   JsonName hs =  student.getDeclaredAnnotation(JsonName.class);
   JsonName ano = field.getDeclaredAnnotation(JsonName.class);
   System.out.println(hs);
   
  }
 
}
