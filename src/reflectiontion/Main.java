package reflectiontion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

import data.structures.Array;

public class Main {
  public static void main(String[] args) throws Exception {
//    Girl girl = new Girl();
//    girl.setName("ngoc trinh ");
//    System.out.println(girl);
    // đây là field của class Girl
//  Field nameField =girl.getClass().getDeclaredField("name");
//  nameField.setAccessible(true);
//  set lại field name của class Girl trên đối tượng girl bằng giá trị Bella 
//  nameField.set(girl, "Bella");
//  System.out.println(girl);
//

    // lấy ra method
//   Class<Girl> girlClass = Girl.class;
//   
//   Method[] methods = girlClass.getDeclaredMethods();
//   for(Method method : methods) {
//     System.out.println();
//     System.out.println("Method: " + method.getName());
//     System.out.println("Parameters :" + Arrays.toString(method.getParameters()));
//   }
//   
//   Method methodSetName = girlClass.getMethod("setName", String.class);
//   Girl girl = new Girl();
//   methodSetName.invoke(girl, "ngoc trinh");
//   System.out.println(girl);
//   

    // lấy ra constructor

//   Class<Girl> girlClass= Girl.class;
//   System.out.println("class: " + girlClass.getSimpleName());
//   System.out.println("COntructors:" + Arrays.toString(girlClass.getConstructors()));
//   try {
//     Girl girl1 = girlClass.newInstance();
//     System.out.println("Girl1: " + girl1);
//     
//     Constructor<Girl> girlContrConstructor = girlClass.getConstructor(String.class);
//     Girl girl2 = girlContrConstructor.newInstance("Hello");
//     System.out.println("Girl2: " + girl2);
//  } catch (Exception e) {
//    e.printStackTrace();
//    // TODO: handle exception
//  }

    // lấy ra anotion

//   Class<Girl> girlClass = Girl.class;
//   System.out.println("Class: "+ girlClass.getSimpleName());
//   for(Annotation annotation: girlClass.getDeclaredAnnotations()) {
//     // lấy ra tên các anotation trên class này 
//     System.out.println("Annotation tren class: " + annotation.annotationType());
//     
//   }
//    for(Method method : girlClass.getDeclaredMethods()) {
//      // lay ra cac method
//      System.out.println("\nMethod: "+ method.getName());
//       for(Annotation annotation : method.getAnnotations()) {
//         // lay ra ten ca annotation tren method nay 
//         System.out.println("Annotation tren method: " +annotation.annotationType());
//       }
//    }

   
Girl gi= new Girl("thang");
System.out.println(gi.toString());
  
  }
  

}
