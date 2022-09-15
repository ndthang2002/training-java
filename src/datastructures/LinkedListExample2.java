package datastructures;

import java.util.LinkedList;

class Student{
	private String name;
	private int age;
	public Student(String name , int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
public String getName() {
	return name;

}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void geAge(int age) {
	this.age=age;
}
@Override
public String toString() {
	return "Student@[name="+name+",age=" + age +"]";
}
	
}
public class LinkedListExample2 {
 public static void main(String[] args) {
	LinkedList<Student> listStudent = new LinkedList<Student>();
	//tạo mới sinh viên 
	Student student1 = new Student("bac",13);
	Student student2 = new Student("trung",20);
	Student student3 = new Student("nam",27);
	//thêm đối tượng vào liststudent
	listStudent.add(student1);
	listStudent.add(student2);
	listStudent.add(student3);
	// show liststudent 
	for(Student student : listStudent) {
		System.out.println(student.toString());
	}
}
}
