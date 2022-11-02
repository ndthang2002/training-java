package app.pluralsight.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


 // phạm vi tồn tại trong lúc chạy 
  @Retention(RetentionPolicy.RUNTIME)
  
    // được sử dụng trên class, interface, method, biến 
  @Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD})
 
  public @interface JsonName{
    String value();
  }

