package app.pluralsight.annotations;

<<<<<<< HEAD

public class Person implements Comparable<Person>{
  
=======
public class Person implements Comparable<Person>{
>>>>>>> 90d6fe93bc7049cb44c548e5602cea48532ec4ca
 private String name;
 private int age;
 
 public Person (String name , int age) {
   this.name = name ;
   this.age =age ;
   
 }
 @CommandKeyword(value ="add")
 public int compareTo(Person person) {
   int compare = name.compareTo(person.name);
    return compare != 0 ? compare : person.age -age;
    
 }
}
