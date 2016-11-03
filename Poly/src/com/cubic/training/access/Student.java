package com.cubic.training.access;

public class Student {
	
	 int id;
	 String name;
	
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	*/
	 public Student(int id, String name) {
			//this();
			this.id = id;
			this.name = name;
			
		}
	 
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s = new Student(1111, "Krish" );
		
		System.out.println(s);
		
	}
	
	
/*	public Student() {
		//super();
		System.out.println("DefAult ConStructor InvoKed");
	}

	
	
	void display(){
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		Student s=new Student(111, "Krish");
		s.display();
	}
*/
}
