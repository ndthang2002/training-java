package javas.oop;

public class LogicalOpTable {
public static void main(String[] args) {
   System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
   boolean p,q;
   p= true ; q=true;
 
     
   System.out.print(p+ "\t"+q +"\t" );
   System.out.print((p&q) +"\t"+(p|q)+"\t");
   System.out.println((p^q) + "\t"+(!p));
   
   
   p= true; q=false;
   System.out.print(p+ "\t"+q+"\t");
   System.out.print((p&q) + "\t" +(p|q)+"\t");
   System.out.println((p^q) + "\t"+(!p));
   
   p =false ; q= true;
   System.out.print(p+ "\t"+q+"\t");
   System.out.print((p&q) + "\t" +(p|q)+"\t");
   System.out.println((p^q) + "\t"+(!p));
   
   p=false ; q=false;
   System.out.print(p+ "\t"+q+"\t");
   System.out.print((p&q) + "\t" +(p|q)+"\t");
   System.out.println((p^q) + "\t"+(!p));
   p=true;q=false;
   
  System.out.println(p&&q);// toán hạng đầu tiên là fasle thì ko cần xét cái 2;
  
  System.out.println(p||q); // toán tử đầu tiên là true thì ko cần xét cái 2 
  
  System.out.println(q & p);
  
  System.out.println(q^p);
  
  
}
}
