package optional;

import java.util.Optional;

public class Main {
public static void main(String[] args) {
  String hihi = null;
   Optional<String > optional = Optional.ofNullable(hihi);
   optional.ifPresent(s -> 
   System.out.println(s));
   
   String b = optional.orElse("chuoi nay null roi ");
   System.out.println(b);
   
   String c = optional.orElseGet(() -> {
     StringBuilder sb = new StringBuilder("ok null");
     return sb.toString();
   });
   System.out.println(c);
}
  
}
