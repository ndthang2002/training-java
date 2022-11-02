package functionalinterface;

// anotation biểu thị đây là class functional interface chỉ có duy nhất 1 hàm 
@FunctionalInterface
public interface StringProcessor {
    public String process(String input);
   

}
