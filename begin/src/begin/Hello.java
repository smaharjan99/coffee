package begin;

public class Hello {
	
	int data = 50; //instance variable or Global Variable
	static int b = 100; //static variable
	
	void print(){ //method name where void is return type
		int data = 10; //local variable
		System.out.println(data); // printing local variable
	}
	
	static void read()//static method
	{
		b=200;
	}
	
	public static void main(String[] args) { //public access modifier, static is non-access modifier, main is the method name, void is return type
	
		
		Hello t= new Hello();//creating object of the class
		//class object = new class();
		//Hello t1 = new Hello();
		
		System.out.println("Instance variable is "+t.data);//printing global variable through the object
		
		read();
		
		System.out.println(b);
		
		t.print();//executing local variable or printing local variable
		
		//t1.print();
	}

}
