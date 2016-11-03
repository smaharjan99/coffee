package training;

public class Test  {

	public Test() {
		//System.out.println("Constructor is invoked");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t= new Test();
		//t.show();
		Student.change();
		Student s1 = new Student(101, "ram");
		Student s2 = new Student(102, "Krish");
		s1.display();
		s2.display();
		
		//System.out.println("data is  "+obj.data);
		//obj.show();
	}
	

}
