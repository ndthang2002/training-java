package functionalinterface;

public class Main {

  public static String getStr(String input ,StringProcessor processor) {
    return processor.process(input);
  }
  
public static void main(String[] args) {
  // không lambda
//   System.out.println(getStr("hello thang", new StringProcessor() {
//      
//      @Override
//      public String process(String input) {
//        // TODO Auto-generated method stub
//        return input.toUpperCase();
//      }
//    }));
   
  // lambda
//  System.out.println( getStr("hello word", inp ->inp.toUpperCase()));

  System.out.println(getStr("hsdfsd" , String::toUpperCase));

   
}
    

    // TODO Auto-generated constructor stub
   
  
}
