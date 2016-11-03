package com.cubic.training.wrap;

public class LocalOuter {

	void display(){
		class LocalInner{
			void read(){
				System.out.println("layers of class in method");
			}
			}
		//Instantiating the class in the method
		//outside the class
		LocalInner l = new LocalInner(); 
		l.read();
	}
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
		

	}

}
