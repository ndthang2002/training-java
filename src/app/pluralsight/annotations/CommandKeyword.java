package app.pluralsight.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface CommandKeyword {
  String value();
  String method() default "calculate";
}
