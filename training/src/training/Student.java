package training;

public class Student {
	
	int id;
	String name;
	static String colgName ;
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
		//this.colgName = colgName;
	}
	
	static{
		colgName = "Cubic";
		System.out.println("static block invoked");
	}
	
	static void change(){
		colgName= "Breign";
	}
	void display(){
		System.out.println(id + " " + name + " "+ colgName);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change();
		
		Student s1= new Student(101, "ram");
		Student s2 = new Student(102, "hari");
		Student s3 = new Student(103, "nandan");
		s1.display();
		s2.display();
		s3.display();

	}

}
