package app.pluralsight.annotations;

import java.lang.reflect.Field;
import java.util.Optional;


public class JsonNameProcessor {

  public static String toJson(Object object) throws IllegalAccessException{
    
    StringBuilder sb = new StringBuilder();
    Class<?> clazz = object.getClass();
    JsonName jsonClassName = clazz.getDeclaredAnnotation(JsonName.class);//lay ra annotation @jsonName tren class
    
    sb.append("{\n")
    .append("\t\"")
    .append(Optional.ofNullable(jsonClassName).map(JsonName::value).orElse(clazz.getSimpleName()))
    .append("\":{\n");
    
    Field fields[] = clazz.getDeclaredFields();
    for(int i=0;i< fields.length;i++) {
      fields[i].setAccessible(true);
      
      JsonName jsonFieldName = fields[i].getDeclaredAnnotation(JsonName.class);
      sb.append("\t\t\"")
      .append(Optional.ofNullable(jsonFieldName).map(JsonName::value).orElse(fields[i].getName()))
      .append("\":")
      .append(fields[i].getType()==String.class || !fields[i].getType().isPrimitive()?"\"":"")
      .append(fields[i].get(object))
      .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive()? "\"":"")
      .append(i != fields.length -1? ",\n":"\n");
    }
    sb.append("\t}\n");
    sb.append("}");
    return sb.toString();
    
  }
}
